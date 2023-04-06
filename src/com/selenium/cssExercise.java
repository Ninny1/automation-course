package com.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssExercise {
    static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.b144.co.il/Magazine/%d7%9e%d7%9c%d7%95%d7%a0%d7%95%d7%aa/%d7%94%d7%92%d7%99%d7%a2-%d7%94%d7%96%d7%9e%d7%9f-%d7%9c%d7%a0%d7%a4%d7%95%d7%a9-7-%d7%98%d7%99%d7%a4%d7%99%d7%9d-%d7%9c%d7%97%d7%99%d7%a4%d7%95%d7%a9-%d7%97%d7%95%d7%a4%d7%a9%d7%94-%d7%91%d7%90%d7%99%d7%a0%d7%98%d7%a8%d7%a0%d7%98/");
    }

    @AfterAll
    public static void afterAll() throws InterruptedException {
        System.out.println("--------------------------");
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {
        WebElement logo = driver.findElement(By.id("logoB144"));

        int w = logo.getRect().getWidth();
        int h = logo.getRect().getHeight();
        if (w==40 && h==40)
            System.out.println("The width and height of element are 40");
        else {
            System.err.println("The width or height of element is NOT 40");
            System.err.println("the width of element is : " + w);
            System.err.println("the height of element is : " + h);
        }
    }

    @Test
    public void test02() throws InterruptedException {
        Thread.sleep(2000);
        WebElement readTime = driver.findElement(By.xpath("//*[@class='tw-mr-[5px]']"));
        System.out.println(readTime.getCssValue("color"));
        if (readTime.getCssValue("color").equals ("rgba(66, 163, 225, 1)"))
            System.out.println("font color is ok " );
        else
            System.err.println("font color fail");
    }

    @Test
    public void test03() throws InterruptedException {
        Thread.sleep(2000);
        WebElement title = driver.findElement(By.xpath("//h1[contains(concat(' ', normalize-space(@class), ' '), ' page-title ')]"));
        System.out.println(title.getCssValue("font-size"));
        if (title.getCssValue("font-size").equals("32px"))
            System.out.println("font size is 32px" );
        else
            System.err.println("font size is not 32px");
    }

    @Test
    public void test04() throws InterruptedException {
        Thread.sleep(2000);
        WebElement icon = driver.findElement(By.className("menuIcon"));
        int x = icon.getRect().getX();
        System.out.println("the x point is : " + x);
        int y = icon.getRect().getY();
        System.out.println("the x point is : " + y);
        if (x==38)
            System.out.println("The X point is good");
        else System.out.println("The X point is not good");
        if (y==15)
            System.out.println("The y point is good");
        else System.out.println("The Y point is good");
    }


}
