package pageobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MainPage {

    @FindBy(xpath = "//a[href='#']")
    private WebElement logOutbutton;

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy (xpath = "//a[@action='push'][contains(text(),'Nasze gry')]")
    private WebElement NaszeGrybutton;





    public WebElement getLogOutbutton() {
        return logOutbutton;
    }

    public void clickOnLogOut (){
        logOutbutton.click();
    }

    public void setSearchField(String text){
        searchField.sendKeys(text);
    }


    public void clickOnNaszeGrybutton(){
        NaszeGrybutton.click();
    }

}

