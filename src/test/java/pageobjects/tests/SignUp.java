package pageobjects.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.Waits;
import pageobjects.pages.MainPage;
import pageobjects.pages.SignInPage;
import pageobjects.pages.SignUpPage;

import static org.junit.Assert.assertTrue;

@RunWith(DataProviderRunner.class)
public class SignUp {

    private WebDriver driver;
    private SignUpPage signUp;
    private SignInPage signIn;
    private MainPage mainPage;

    @DataProvider
    public static Object[][] testDataforSignUp(){
        return new String[][]{
                new String[]{"aaaaa","12345", "aaa@wp.pl"},
                new String[]{"12345","12345", "eeee@wp.pl"},
                new String[]{"abc!","12345", "ppp@wp.pl"},
                new String[]{"aabb","12345", "1234@wp.pl"},
                new String[]{"","12345", "pout@02.pl"},
                new String[]{"aavvx","qqqq@buziaczek.pl"},
        };
    }

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    @UseDataProvider("testDataforSignUp")
    public void checkSignUp(String name, String pass, String email){
        signUp.clickOnRegister();
        signUp.setUserData(name, pass, email);
        signUp.clickOnRegister();
        signIn.clickOnLogSide();
        signIn.setUserData(name, pass);

    }


    @After
    public void tearDown() { driver.close(); }
}
