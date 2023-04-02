package com.selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.IOException;

public class extentRun {

    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test1;
    static ExtentTest test2;
    static ExtentTest test3;
    static ExtentTest test4;
    static ExtentTest test5;
    static ExtentTest test6;
    static ExtentTest test7;
    static ExtentTest test8;
    static ExtentTest test9;


    static ExtentManager exm = new ExtentManager(driver);

    @BeforeClass
    public static void beforeClass()
    {
        extent = ExtentManager.GetExtent();
        test1 = ExtentManager.createTest("test1", "test1 description");
        test2 = ExtentManager.createTest("test2", "test2 description");
        test3 = ExtentManager.createTest("test3", "test3 description");
        test4 = ExtentManager.createTest("test4", "test4 description");
        test5 = ExtentManager.createTest("test5", "test5 description");
        test6 = ExtentManager.createTest("test6", "test6 description");
        test7 = ExtentManager.createTest("test7", "test7 description");
        test8 = ExtentManager.createTest("test8", "test8 description");
        test9 = ExtentManager.createTest("test9", "test8 description");

        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://edu.gov.il/heb/Pages/hp.aspx");

    }

    @AfterClass
    public static void afterClass()
    {
        extent.flush();
        driver.quit();
    }

    @BeforeEach
    public static void beforeEach () throws InterruptedException {
        Thread.sleep(2000);
    }

    @AfterEach
    public static void afterEach() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Test
    public void test1() throws InterruptedException, IOException, AWTException {
        System.out.println(driver.getTitle());
        WebElement menu = driver.findElement(By.linkText("הנהלת המשרד"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("שר החינוך"));
        actions.click(submenu).perform();
        String link1 = driver.getTitle();
        if (link1.contains("שר החינוך")) {
            test1.pass("link 1 - passed");
        }
        else {
            test1.fail("link 1 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen( driver)).build());
        }
    }

    @Test
    public void test2() throws InterruptedException, IOException, AWTException {
        System.out.println(driver.getTitle());

        WebElement menu = driver.findElement(By.linkText("הנהלת המשרד"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("שר במשרד החינוך"));
        actions.click(submenu).perform();
        String link2 = driver.getTitle();
        if (link2.contains("שר במשרד החינוך")) {
            test2.pass("Link 2 - passed");
        }
        else {
            test2.fail("Link 2 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen( driver)).build());
        }
    }

    @Test
    public void test3() throws InterruptedException, IOException, AWTException {
        System.out.println(driver.getTitle());

        WebElement menu = driver.findElement(By.linkText("הנהלת המשרד"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("מנכ\"ל משרד החינוך"));
        actions.click(submenu).perform();
        String link3 = driver.getTitle();
        if (link3.equals("מנכ\"ל משרד החינוך")) {
            test3.pass("Link 3 - passed");
        }
        else {
            test3.fail("Link 3 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen( driver)).build());
        }
    }

    @Test
    public void test4() throws InterruptedException, IOException, AWTException {
        System.out.println(driver.getTitle());

        WebElement menu = driver.findElement(By.linkText("אודות המשרד"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("יחידות המשרד"));
        actions.click(submenu).perform();
        String link4 = driver.getTitle();
        if (link4.contains("יחידת המשרד")) {
            test4.pass("Link 4 - passed");
        }
        else {
            test4.fail("Link 4 - failed", MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen(driver)).build());
        }
    }

    @Test
    public void test5() throws InterruptedException, IOException, AWTException {
        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        WebElement menu = driver.findElement(By.linkText("אודות המשרד"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("תולדות משרד החינוך"));
        actions.click(submenu).perform();
        String link1 = driver.getTitle();
        if (driver.getTitle().equals("תולדות משרד החינוך")) {
            test5.pass("Link 5 - passed");
        }
        else {
            test5.fail("Link 5 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);


    }

    @Test
    public void test6() throws InterruptedException, IOException, AWTException {
        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        WebElement menu = driver.findElement(By.linkText("אודות המשרד"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("שרים לשעבר"));
        actions.click(submenu).perform();
        String link1 = driver.getTitle();
        if (driver.getTitle().equals("שרים לשעבר")) {
            test6.pass("Link 6 - passed");
        }
        else {
            test6.fail("Link 6 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);

    }

    @Test
    public void test7() throws InterruptedException, IOException, AWTException {
        Thread.sleep(2000);

        action("רפורמות ותוכניות", "גני ילדים", driver);
        String link1 = driver.getTitle();
        System.out.println(link1);
        if (driver.getTitle().equals("פורטל תלמידים")) {
            test7.pass("Link 7 - passed");
        }
        else {
            test7.fail("Link 7 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.navigate().back();

    }

    @Test
    public void test8() throws InterruptedException, IOException, AWTException {
        Thread.sleep(2000);
        action("רפורמות ותוכניות", "ועדת ביטון", driver);
        String link1 = driver.getTitle();
        System.out.println(link1);
        if (driver.getTitle().equals("ועדת ביטון")) {
            test8.pass("Link 8 - passed");
        }
        else {
            test8.fail("Link 8 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Test
    public void test9() throws InterruptedException, IOException, AWTException {
        Thread.sleep(2000);
        action("רפורמות ותוכניות", "ועדת חיים בשותפות", driver);
        String link1 = driver.getTitle();
        System.out.println(link1);
        if (driver.getTitle().contains("ועדת חיים בשותפות")) {
            test9.pass("Link 9 - passed");
        }
        else {
            test9.fail("Link 9 - failed",MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);

        driver.navigate().back();
    }

    public static void action(String linka, String linkb, WebDriver driver) throws InterruptedException {
        WebElement menu = driver.findElement(By.linkText(linka));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText(linkb));
        actions.click(submenu).perform();
    }
}
