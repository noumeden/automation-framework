package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Button_click_PO extends BasePO{
    public  String URL_button_login="http://www.webdriveruniversity.com/Click-Buttons/index.html";
    public Button_click_PO(){
        super();
    }
    @FindBy()
    WebElement btn_button_click;
    public void navigateToButtonClick(){
        navigateToUrl(URL_button_login);
    }
}
