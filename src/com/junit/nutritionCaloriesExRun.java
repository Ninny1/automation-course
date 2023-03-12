package com.junit;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class nutritionCaloriesExRun {
    static WebDriver driver;
    static NutritionCaloriesEx_elements elements = new NutritionCaloriesEx_elements();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.netogreen.co.il/Calculators/Nutrition-Calories.aspx");
        elements = PageFactory.initElements(driver, NutritionCaloriesEx_elements.class);

    }

    @BeforeEach
    public void beforeEach(){
        elements = PageFactory.initElements(driver, NutritionCaloriesEx_elements.class);
        //elements.searchTxt.clear();
    }

    @AfterAll
    public static void afterAll() throws InterruptedException {
        System.out.println("--------------------------");
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    @Order(1)
    public void test01() throws InterruptedException {
        elements.searchTxt.sendKeys("לחם");
        elements.btn.click();
        Thread.sleep(1000);
        if (elements.searchResult.getText().contains("לחם"))
            System.out.println("Test 1 passed");
        else System.err.println("Test 1 failed");
        Thread.sleep(1000);
    }

    @Test
    @Order(2)
    public void test02() throws InterruptedException {
        elements.searchTxt.clear();
        elements.searchTxt.sendKeys("111111");
        elements.btn.click();
        Thread.sleep(1000);
        if (elements.searchResult.getText().contains("לא נמצאו מזונות, נסה שנית."))
            System.out.println("Test 2 passed");
        else System.err.println("Test 2 failed");
        Thread.sleep(1000);
    }

    @Test
    @Order(3)
    public void test03() throws InterruptedException {
        elements.searchTxt.clear();
        elements.searchTxt.sendKeys("לחם");
        elements.btn.click();
        Thread.sleep(1000);
        elements.searchResultOlives.click();
        elements.addBtn.click();
        if(wait.until(ExpectedConditions.alertIsPresent())==null)
            System.err.println("Test 3 failed - Alert is not present");
        else System.out.println("Test 3 passed - Alert is present");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

    }

    @Test
    @Order(4)
    public void test04() throws InterruptedException {
        elements.quantity.sendKeys("abc");
        Thread.sleep(1000);
        if (elements.quantity.getText().isEmpty())
            System.out.println("Test 4 passed");
        else System.err.println("Test 4 failed");
        Thread.sleep(1000);
    }

    @Test
    @Order(5)
    public void test05() throws InterruptedException {
        elements.quantity.sendKeys("900000000");
        elements.addBtn.click();
        Thread.sleep(1000);
        if(driver.switchTo().alert().getText().contains("3001"))
            System.out.println("Test 5 passed");
        else System.err.println("Test 5 failed");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

    }

    @Test
    @Order(6)
    public void test06() throws InterruptedException {
        elements.quantity.clear();
        elements.quantity.sendKeys("5");
        Thread.sleep(1000);
        elements.addBtn.click();
        Thread.sleep(1000);
        if (elements.food_name.get(1).getText().equals("לחם זיתים"))
            System.out.println("Test 6 passed - The item was added");
        else System.err.println("Test 6 failed - The item was not added");
        Thread.sleep(1000);
    }

    @Test
    @Order(7)
    public void test07() throws InterruptedException {
        elements.searchTxt.clear();
        elements.searchTxt.sendKeys("לחם");
        elements.btn.click();
        Thread.sleep(1000);
        elements.searchResult.click();
        elements.quantity.clear();
        elements.quantity.sendKeys("2");
        Thread.sleep(500);
        elements.addBtn.click();
        Thread.sleep(1000);
        if (elements.food_name.get(2).getText().contains("לחם לבן"))
            System.out.println("Test 7 passed - The item was added");
        else System.err.println("Test 7 failed - The item was not added");
        Thread.sleep(1000);
    }

    @Test
    @Order(8)
    public void test08() throws InterruptedException {
        if(elements.food_name.get(1).getText().contains("לחם זיתים")) {
            elements.remove1Item.click();
            System.out.println("Test 8 passed - Removed");
        }
        else System.err.println("Test 8 failed - Not removed");
        Thread.sleep(1000);
    }

    @Test
    @Order(9)
    public void test09() throws InterruptedException {
        elements.searchTxt.clear();
        elements.searchTxt.sendKeys("לחם");
        elements.btn.click();
        Thread.sleep(1000);
        elements.searchResultHamaniot.click();
        elements.quantity.clear();
        elements.quantity.sendKeys("2");
        Thread.sleep(500);
        elements.addBtn.click();
        Thread.sleep(1000);
        if (elements.food_name.get(2).getText().equals("לחם חמניות מופחת מלח"))
            System.out.println("Test 9 passed");
        else System.err.println("Test 9 failed");
        Thread.sleep(1000);
    }

    @Test
    @Order(10)
    public void test10() throws InterruptedException {
        int calories = Integer.parseInt(elements.firstItemCalories.getText()) + Integer.parseInt(elements.secondItemCalories.getText());
        if (elements.allCalories.getText().contains(String.valueOf(calories)))
            System.out.println("Test 10 passed - Equals");
        else System.err.println("Test 10 failed");
        Thread.sleep(1000);
    }

    @Test
    @Order(11)
    public void test11() throws InterruptedException {
        int calories = Integer.parseInt(elements.firstItemCarbo.getText()) + Integer.parseInt(elements.secondItemCarbo.getText());
        String carboStr = elements.allCarbos.getText().replaceAll("[^\\d.]", "");
        if (calories == Integer.parseInt(carboStr))
            System.out.println("Test 11 passed - Equals");
        else System.err.println("Test 11 failed");
        Thread.sleep(1000);
    }
}
