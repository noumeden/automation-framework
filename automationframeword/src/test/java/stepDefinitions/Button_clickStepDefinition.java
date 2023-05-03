package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Button_clickStepDefinition {
    @Given("I access the webdriver university")
    public void i_access_the_webdriver_university() {
        System.out.println("test1");
    }
    @When("click on BUTTON CLICKs")
    public void click_on_button_clic_ks() {
        System.out.println("test2");
    }
    @Then("i should get message  {string}")
    public void i_should_get_message(String string) {
        System.out.println("test3");
    }
    @Then("get the content of every element")
    public void get_the_content_of_every_element() {
        System.out.println("test4");
    }
    @When("I click on CLICK ME button")
    public void i_click_on_click_me_button() {
        System.out.println("test5");
    }
    @Then("I should get alert message of each element")
    public void i_should_get_alert_message_of_each_element() {
        System.out.println("test6");
    }


}
