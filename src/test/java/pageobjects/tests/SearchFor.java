package pageobjects.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.pages.MainPage;

import java.util.concurrent.TimeUnit;

public class SearchFor {


    private WebDriver driver;

    private MainPage mainPage;

    @Before
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();

        mainPage = PageFactory.initElements(driver, MainPage.class);

    }

    @Test
    public void addToSearch_bb() {
        driver.get("http://app.pinapple.jdqz1.is-academy.pl/");
        driver.findElement(By.id("username")).sendKeys("adminps1");
        driver.findElement(By.id("password")).sendKeys("adminps1");
        mainPage.clickOnNaszeGrybutton();



        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement submitNaszeGry = driver.findElement(By.cssSelector("a[href='/games-list']"));
        submitNaszeGry.click();
        WebDriverWait wait = new WebDriverWait(driver, 1);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        mainPage.setSearchField("bbb");



    }

    @Test
    public void addToSearchSc() {
        driver.get("http://app.pinapple.jdqz1.is-academy.pl/");
        driver.findElement(By.id("username")).sendKeys("adminps1");
        driver.findElement(By.id("password")).sendKeys("adminps1");
        WebElement submitZaloguj = driver.findElement(By.xpath("//button[text()='Zaloguj']"));
        submitZaloguj.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement submitNaszeGry = driver.findElement(By.cssSelector("a[href='/games-list']"));
        submitNaszeGry.click();
        WebDriverWait wait = new WebDriverWait(driver, 1);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        mainPage.setSearchField("Sc");
    }
    @Test
    public void addToSearchScrrable() {
        driver.get("http://app.pinapple.jdqz1.is-academy.pl/");
        driver.findElement(By.id("username")).sendKeys("adminps1");
        driver.findElement(By.id("password")).sendKeys("adminps1");
        WebElement submitZaloguj = driver.findElement(By.xpath("//button[text()='Zaloguj']"));
        submitZaloguj.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement submitNaszeGry = driver.findElement(By.cssSelector("a[href='/games-list']"));
        submitNaszeGry.click();
        WebDriverWait wait = new WebDriverWait(driver, 1);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        mainPage.setSearchField("Scrabble");
    }

    @After

    public void tearDown() {
        driver.close();
    }
}
