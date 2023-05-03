package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_vars;

public class Login_PO  extends BasePO{
    @FindBy(id="login-button")
    WebElement login_button_field;
    @FindBy(id="text")
    WebElement username_textField;

    @FindBy(id = "password")
    WebElement password_textField;
    String urlLogingPageFeature= Global_vars.WEBDRIVERUNIVERSITY_HOMEPAGE_URL+"Login-Portal/index.html";
    public Login_PO(){
       super();

    }
    public void navigateToWebUniversityLogin() {

        navigateToUrl(urlLogingPageFeature);
    }
    public void setUserName(String userName){

        sendkeys(username_textField,userName);
    }
    public void setPassword(String password){

        sendkeys(password_textField,password);
    }
    public void clikLoginButton(){

        sendkeys(login_button_field);
    }
    public void validate_succesffull_message(String message){

        waitForAlert_validateMessage(message);
    }
}
