package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class exercises {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ninog\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1
        driver.get("https://danielauto.net/practice/newLocator/locator.html");
        Thread.sleep(2000);
        driver.findElement(By.id("myText")).sendKeys("Ninny Sophie Ariel");
        driver.findElement(By.id("btn")).click();
        driver.getCurrentUrl();
        System.out.println(driver.findElement(By.id("myText2")).getText());
        if("Ninny Sophie Ariel".equals(driver.findElement(By.id("myText2")).getText()))
            System.out.println("Yes");
        else System.out.println("No");
        Thread.sleep(2000);
        driver.navigate().back();
        //2
        driver.findElement(By.name("by_Name")).click();
        Thread.sleep(2000);
        //3
        System.out.print(driver.findElement(By.tagName("h3")).getText() + " "
                + driver.findElement(By.className("c_name")).getText());
        System.out.println();
        //4
        System.out.println(driver.findElement(By.xpath("/html/body/p[5]")).getText());
        //5
        driver.findElement(By.linkText("Click me to check link text")).click();
        driver.getCurrentUrl();
        System.out.println(driver.findElement(By.id("link_text")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //6
        driver.getCurrentUrl();
        driver.findElement(By.partialLinkText("partial")).click();
        driver.getCurrentUrl();
        System.out.println(driver.findElement(By.id("p_link_text")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //7
        driver.findElement(By.cssSelector("input[type='button']")).click();
        driver.getCurrentUrl();
        System.out.println(driver.findElement(By.id("btn")).getText());
        Thread.sleep(2000);

        driver.quit();

    }
}
