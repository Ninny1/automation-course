package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class mashkantaEx {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.supermarker.themarker.com/");

        //א#
        driver.findElement(By.id("txtSearch")).sendKeys( "מחשבון ");
        Thread.sleep(2000);
        WebElement ul = driver.findElement(By.id("ui-id-1"));
        List<WebElement> searchResult = ul.findElements(By.xpath("//ul//li[@class='ui-menu-item']"));
        searchResult.get(1).click();
        Thread.sleep(1000);

        //ב#
        driver.findElement(By.xpath("//*[@id=\"rblSelectCalcType\"]/label[1]/span")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"rblSelectCalcType\"]/label[1]/span")).getText());
        System.out.println("Chosen");

        //ג#
        WebElement mouseOver = driver.findElement(By.xpath("//*[@id=\"mortgageCalculatorType\"]/tbody/tr[3]/td[1]/img"));
        Actions action = new Actions(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mouseOver);
        Thread.sleep(500);
        action.moveToElement(mouseOver).build().perform();
        Thread.sleep(2000);
        System.out.println(mouseOver.getAttribute("alt"));

        //ד#
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"rblSelectKeren\"]/label[2]/span")).click();

        //ה#
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"rblMadad\"]/label[1]/span")).click();

        //ו#
        Thread.sleep(1000);
        driver.findElement(By.id("txtLoanAmount")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("txtLoanAmount")).sendKeys("500000");

        //ז#
        Thread.sleep(1000);
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderTerm\"]/span"));
        new Actions(driver).clickAndHold(slider).moveByOffset(35,0).release(slider).perform();
        if (driver.findElement(By.xpath("//*[@id=\"txtTerm\"]")).getAttribute("value").equals("20")){
            System.out.println("20 shana");
        }
        else System.out.println("Lo 20 shana");

        //ח#
        Thread.sleep(1000);
        driver.findElement(By.id("txtInterest")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("txtInterest")).sendKeys("3.75" + Keys.ENTER);

        //ט#
        Thread.sleep(1000);
        driver.findElement(By.id("ibCalc")).click();

        //י#
        Thread.sleep(1000);
        String copyToEmail = driver.findElement(By.id("keren")).getText();
        driver.findElement(By.id("txtEmail")).sendKeys(copyToEmail);

        //יא#
        Thread.sleep(1000);
        driver.findElement(By.id("txtShemPrati")).sendKeys("Ninny");

        //יב#
        Thread.sleep(1000);
        driver.findElement(By.id("btnSendLid")).click();

        //יג
        System.out.println(driver.findElement(By.xpath("//*[@id=\"getOffer\"]/table/tbody/tr[2]/td/label")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"getOffer\"]/table/tbody/tr[3]/td/label")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"getOffer\"]/table/tbody/tr[6]/td/label")).getText());

    }
}
