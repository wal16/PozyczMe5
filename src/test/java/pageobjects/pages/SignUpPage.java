package pageobjects.pages;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    @FindBy(xpath = "//a[@id='tab-tab-2']")
    private WebElement RegistationSide;

    @FindBy(css = "#tab-pane-2 input#username.form-control")
    private WebElement username;

    @FindBy(css = "#tab-pane-2 input#password.form-control")
    private WebElement password;

    @FindBy(css = "tab-pane-2 input#email.form-control")
    private WebElement email;

    @FindBy(xpath = "//button[text()='Zarejestruj się']")
    private WebElement RegisterButton;

    public void clickOnRegisterSide(){
        RegistationSide.click();
    }

    public void setUserData(String name, String pass, String mail){
        username.sendKeys(name);
        password.sendKeys(pass);
        email.sendKeys(mail);
    }
    public void clickOnRegister() {RegisterButton.click();}
}
