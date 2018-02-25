package pageobjects.tests;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import pageobjects.pages.MainPage;
import pageobjects.Waits;
import pageobjects.pages.SignInPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

    private static final String URL = "http://app.pinapple.jdqz1.is-academy.pl/";
    private WebDriver driver;
    private SignInPage sign;
    private MainPage mainPage;
    private Waits wait;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        sign = PageFactory.initElements(driver, SignInPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        driver.get(URL);

    }

    @Test
    public void testLoginWithGoodData() {

       sign.clickOnLogSide();
       sign.setUserData("aaaaa", "12345");
       sign.clickOnSignIn();
       wait.waitForElementToBeClickable(driver,mainPage.getLogOutbutton());
       assertTrue(mainPage.getLogOutbutton().getText().equals("Wyloguj"));

    }

    @Test
    public void testLoginWithWrongData(){

        sign.clickOnLogSide();
        sign.setUserData("a", "123");
        sign.clickOnSignIn();

    }

    @After
    public void tearDown() { driver.close(); }

}
