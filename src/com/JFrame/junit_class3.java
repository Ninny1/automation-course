package com.JFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Scanner;

public class junit_class3 {
    static String alert3;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://danielauto.net/practice/action/alert.html");

        driver.findElement(By.id("alert3")).click();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        driver.switchTo().alert().sendKeys(name);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        alert3 = driver.findElement(By.id("text")).getText();
        jframeEx.label3.setText(alert3);
        System.out.println(alert3);
        driver.quit();

        /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.promptResponse=prompt('Please enter your name')");
        Alert alert = driver.switchTo().alert();
        Thread.sleep(10000);
        String name = (String) js.executeScript("return window.promptResponse");
        alert.accept();
        System.out.println(name);

         */




    }
}
