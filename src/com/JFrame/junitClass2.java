package com.JFrame;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class junitClass2 {
    static WebDriver driver;
    static String alert2;

    @BeforeClass
    public static void beforeAll(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://danielauto.net/practice/action/alert.html");
    }

    @AfterClass
    public static void afterAll(){
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException{
        driver.findElement(By.id("alert2")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        alert2 = driver.findElement(By.id("demo")).getText();
        jframeEx.label2.setText(alert2);
        System.out.println(alert2);
    }
}
