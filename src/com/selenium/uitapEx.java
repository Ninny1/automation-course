package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class uitapEx {
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterClass() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://uitestingplayground.com/dynamicid");
        driver.findElement(By.xpath("//div[@class='container']//button")).click();
        Thread.sleep(2000);
    }

    @Test
    public void test02() throws InterruptedException{
        driver.get("http://uitestingplayground.com/classattr");
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

    @Test
    public void test03() throws InterruptedException {
        driver.get("http://uitestingplayground.com/hiddenlayers");
        driver.findElement(By.id("greenButton")).click();
        Thread.sleep(1000);
        try {
            driver.findElement(By.id("greenButton"));
            System.out.println("You clicked once");
        } catch (NoSuchElementException e) {
            System.out.println("Not clickable any more");
        }
        Thread.sleep(2000);
    }

}

