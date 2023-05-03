package stepDefinitions.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_PO;

public class Login_stepDefinition {
Login_PO login_po = new Login_PO();
    @Given("I access the webdriver university contact login page")
    public void i_access_the_webdriver_university_contact_login_page() {
        login_po.navigateToWebUniversityLogin();
    }
    @When("I enter username {string}")
    public void i_enter_username(String username) {
        login_po.setUserName(username);
    }
    @And("enter a password {string}")
    public void enter_a_password(String password) {

        login_po.setPassword(password);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        login_po.clikLoginButton();
    }
    @Then("I should be presented {string}")
    public void i_should_be_presented(String message) throws Throwable{
        login_po.validate_succesffull_message(message);
    }
    // deuxieme partie



    @When("^I enter a username (.*)$")
    public void i_enter_a_username_webdriver(String username) throws Throwable {
login_po.setUserName(username);
    }
    @When("^I enter a password (.*)$")
    public void i_enter_a_password_webdriver123(String password) throws Throwable {
        login_po.setPassword(password);
    }

    @Then("^I should be presented with the following login validation message (.*)$")
    public void i_should_be_presented_with_the_following_login_validation_message_validation_succeeded(String message) throws Throwable {
        login_po.validate_succesffull_message(message);
    }
}
