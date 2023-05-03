package pageObject;

import drivers.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_vars;

import java.io.IOException;
import java.time.Duration;

public class BasePO {
    public BasePO() {

        PageFactory.initElements(getDriver(),this);
    }

    public WebDriver getDriver() {

        return DriverFactory.getDriver();
    }
    public void navigateToUrl(String url){

        getDriver().navigate().to(url);
    }

    public String generateRandomNumber(int length) {

        return RandomStringUtils.randomNumeric(length);
    }

    public String generateRandomString(int legth) {

        return RandomStringUtils.randomAlphabetic(legth);
    }
public void sendkeys(By by,String textType){
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_vars.DEFAULT_EXPLICIT_Timeout));
    wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textType);

}
    public void sendkeys(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_vars.DEFAULT_EXPLICIT_Timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public void sendkeys(WebElement element,String textType){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_vars.DEFAULT_EXPLICIT_Timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textType);
    }
    public void waitForAlert_validateMessage(String text){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_vars.DEFAULT_EXPLICIT_Timeout));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=getDriver().switchTo().alert();
        String message= alert.getText();
       try {
           Assert.assertEquals(message, text);
           alert.accept();
       } catch (NoAlertPresentException e){
           System.out.println("Aucune alert est prent");
       } catch (WebDriverException e){
           System.out.println("une exception webdriver s'est produit"+e.getMessage());
       }catch (Exception e){
           System.out.println("une exception s'est produit"+e.getMessage());
       }

    }
    public void validateFieldMessage(WebElement element){

        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_vars.DEFAULT_EXPLICIT_Timeout));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}
