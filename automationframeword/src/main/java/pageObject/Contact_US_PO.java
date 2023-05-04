package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_vars;

public class Contact_US_PO extends BasePO{
    String urlContact = Global_vars.WEBDRIVERUNIVERSITY_HOMEPAGE_URL+ "Contact-Us/contactus.html";
    public Contact_US_PO(){
        super();
    }
    @FindBy(name = "first_name")
    WebElement fisrt_name_field;

    @FindBy(name = "last_name")
    WebElement last_name_field;

    @FindBy(name = "email")
    WebElement email_field;

    @FindBy(name = "message")
    WebElement comment_field;

    @FindBy(xpath= "//input[@type='submit']")
    WebElement submit_field;

    @FindBy(id = "contact_reply")
    WebElement message_field;
public void navigateToUniversityContactUs(){
    navigateToUrl(urlContact);
}
    public void  setFisrt_name_field(String firstName){
        sendkeys(fisrt_name_field,firstName);
    }
    public void setLast_name_field(String lastName){
        sendkeys(last_name_field,lastName);
    }
    public void  setEmail_field(String email){
        sendkeys(email_field,email);
    }
   public void setComment_field(String comment){
        sendkeys(comment_field,comment);
   }
   public void validateSubmitButtonContact(){
        sendkeys(submit_field);
   }
   public void validateSuccefullContactMessage (String message){
       validateFieldMessage(message_field);
       String currentMessage = getDriver().findElement(By.id("contact_reply")).getText();
       Assert.assertEquals(currentMessage,message);
   }
}
