package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tiran-bank.co.il/conversion-calculator/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[2]/section[2]/div/div/div/section/div/div[1]/div/div[3]/div/iframe")));
        driver.findElement(By.id("SelectCurrencyAmount")).clear();
        driver.findElement(By.id("SelectCurrencyAmount")).sendKeys("50");
        driver.findElement(By.className("widgetfield")).submit();
        driver.switchTo().defaultContent();


        /*Thread.sleep(5000);
        driver.findElement(By.id("query")).sendKeys("חשמלאים");
        //driver.findElement(By.partialLinkText("מוניות")).click();
        driver.findElement(By.className("search_submit")).click();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        if ("חשמלאים - כ-3838 חשמלאים מוסמכים בכל הארץ - דפי זהב NoIndex NoFollow noidx".equals(driver.getTitle()))
            System.out.println("Yes");
        else System.out.println("No");


        Thread.sleep(5000);
        //driver.quit();

         */
    }
}
