package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class supermarket {

    static WebDriver driver;
    static double shufersalPrice = 0, ramiPrice = 0, quickPrice = 0, cheapest;
    String superName;

    @BeforeClass
    public static void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("--------------------------------------------------");
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.shufersal.co.il/online/he/");
        Thread.sleep(2000);
        driver.findElement(By.id("js-site-search-input")).sendKeys("שניצל תירס טבעול");
        driver.findElement(By.xpath("//button[@class='btnSubmit js_search_button']")).click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainProductGrid\"]//li[1]//span[@class='number'][1]")));
        String price = driver.findElement(By.xpath("//*[@id=\"mainProductGrid\"]//li[1]//span[@class='number'][1]")).getText();
        price = price.trim();
        shufersalPrice = Double.parseDouble(price);
        System.out.println("Shufersal: " + shufersalPrice);
        Thread.sleep(1000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.rami-levy.co.il/he/online/market");
        Thread.sleep(3000);
        driver.findElement(By.id("destination")).sendKeys("שניצל תירס טבעול" + Keys.ENTER);
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-133428\"]/div[4]/div/div/span/span")));
        String price = driver.findElement(By.xpath("//*[@id=\"item-133428\"]/div[4]/div/div/span/span")).getText();
        price = price.replaceAll("₪", "");
        price = price.trim();
        ramiPrice = Double.parseDouble(price);
        System.out.println("RamiLevi: " + ramiPrice);
        Thread.sleep(1000);
    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("https://quik.co.il/");
        Thread.sleep(7000);
        driver.findElement(By.className("searchInput_KC6")).sendKeys("שניצל תירס טבעול");
        driver.findElement(By.className("searchInput_KC6")).sendKeys(Keys.ENTER);
        WebElement firstResult2 = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-7290111566752\"]/div[5]/div/strong")));
        String price1 = driver.findElement(By.xpath("//*[@id=\"product-7290111566752\"]/div[5]/div/strong")).getText();
        String price2 = driver.findElement(By.xpath("//*[@id=\"product-7290111566752\"]/div[5]/div/small[2]")).getText();
        price1 = price1.trim();
        price2 = price2.trim();
        double quickPrice1 = Double.parseDouble(price1);
        double quickPrice2 = Double.parseDouble(price2);
        quickPrice = quickPrice1 + (quickPrice2 / 100);
        System.out.println("Quick: " + quickPrice);
        Thread.sleep(1000);

    }

    @Test
    public void test4_cheapest (){
        if(shufersalPrice < ramiPrice) {
            if(quickPrice < shufersalPrice) {
                cheapest = quickPrice;
                superName = "Quick";
            } else {
                cheapest = shufersalPrice;
                superName = "Shufersal";
            }
        } else {
            if(ramiPrice < quickPrice) {
                cheapest = ramiPrice;
                superName = "RamiLevi";
            } else {
                cheapest = quickPrice;
                superName = "Quick";
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("The price in " + superName + " is the cheapest: " + cheapest);
    }

}
