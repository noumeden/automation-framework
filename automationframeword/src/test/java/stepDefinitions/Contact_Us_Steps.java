package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;;
import org.openqa.selenium.WebDriver;
import pageObject.BasePO;
import pageObject.Contact_US_PO;
public class Contact_Us_Steps extends BasePO {
  /* Contact_US_PO contactUsPo = new Contact_US_PO();
    private WebDriver driver = getDriver();

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {

     contactUsPo.navigateToUniversityContactUs();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {


   contactUsPo.setFisrt_name_field("jerome");
    }

    @And("I enter a unique last name")
    public void i__a_unique_last_name() {
contactUsPo.setLast_name_field("dongmo");

    }

    @When("I enter a unique email adress")
    public void i_enter_a_unique_email_adress() {

        sendkeys(By.xpath("//input[@name='email']"),"dongmo@gmail.com");
    }

    @And("I enter a  unique password")
    public void i_enter_a_unique_password() {

        System.out.println("simple test4");
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
contactUsPo.setComment_field("bienvenue au campus webdriver university");
    }

    @And("I click submit button")
    public void i_click_submit_button() {
        contactUsPo.validateSubmitButtonContact();

    }

    @Then("I should be presented with message")
    public void i_should_be_presented_with_message() {

   contactUsPo.validateSuccefullContactMessage("Thank You for your Message!");
    }


    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name_joe(String firstName) {

        contactUsPo.setFisrt_name_field(firstName);

    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name_blogs(String lastName) {

        contactUsPo.setLast_name_field(lastName);

    }

    @And("I enter a specific email adress {word}")
    public void i_enter_a_specific_email_adress_joe_blogs123_gmail_com(String email) {

        contactUsPo.setEmail_field(email);

    }

    @And("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {

        contactUsPo.setComment_field(comment);

    }*/


}
