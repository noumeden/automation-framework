package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginFitec {
    WebDriver driver;
    @Before
    public void sepup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }
    @Given("I access webdriver campus-fitec")
    public void i_access_webdriver_campus_fitec() {
        driver.navigate().to("https://www.campus-cql.fitec.fr/auth/login");

    }
    @When("^I enter my {string}")
    public void i_enter_my_formateur20(String username) {
        driver.findElement(By.id("username")).sendKeys("username");

    }
    @And("et enter my {}")
    public void et_enter_my_formateur20(String password) {
        driver.findElement(By.id("password")).sendKeys("password");

    }
    @When("I click to button ouvrir une session")
    public void i_click_to_button_ouvrir_une_session() {

    }
    @Then("I access in home page campus-fitec")
    public void i_access_in_home_page_campus_fitec() {

    }
}
