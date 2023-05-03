package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    private static ThreadLocal <WebDriver> webdriver= new ThreadLocal<>();
    public static WebDriver getDriver(){
        if(webdriver.get() == null){
            webdriver.set(createWebdriver());
        }
        return webdriver.get();
    }
    public static WebDriver createWebdriver(){
        WebDriver driver = null;
        String  driverType= getBrowserType();
      if(driverType.equals("chrome")){
          //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
          WebDriverManager.chromedriver().setup();
          ChromeOptions chromeOptions = new ChromeOptions();
          //chromeOption est une classe de ChromeDriver
          //Indique que WebDriver doit attendre que l'état de préparation du document soit "complet" après la navigation. Il s'agit de la stratégie de chargement de page par défaut.
          chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
          // on peut créer une instance de chromeDriver en utilisant la strategie de chargement dans option
          driver = new ChromeDriver(chromeOptions);
          System.out.println("la valeur du driver :" + driver);

      }else if (driverType.equals("edge")){
          WebDriverManager.edgedriver().setup();
          EdgeOptions edgeOptions = new  EdgeOptions();
          edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
          driver = new EdgeDriver(edgeOptions);

      } else if (driverType.equals("firefox")){
          WebDriverManager.firefoxdriver().setup();
          FirefoxOptions firefoxOptions = new FirefoxOptions();
          firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
          driver= new FirefoxDriver(firefoxOptions);
        }
      driver.manage().window().maximize();

return driver;
    }
    public static String getBrowserType()  {
        String browserType= null;
        String browserTypeRemoveValue= System.getProperty("browseType");
       /* if(browserType   RemoveValue==null || browserTypeRemoveValue.isEmpty()){
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/properties/config.properties");
            properties.load(fileInputStream);
            browserType  =properties.getProperty("browser").toLowerCase().trim();
        } else {
            browserType=browserTypeRemoveValue
        }*/

        try{
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/properties/config.properties");
            properties.load(fileInputStream);
            browserType  =properties.getProperty("browser").toLowerCase().trim();

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return browserType;
    }
    public static void cleanupDriver(){
        webdriver.get().quit();
        webdriver.remove();
    }
}
