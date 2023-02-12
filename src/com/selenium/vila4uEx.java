package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class vila4uEx {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.vila4u.com/");

        driver.findElement(By.xpath("//*[@id=\"siteSearch\"] ")).sendKeys("וילות בצפון");
        driver.findElement(By.xpath("//*[@id=\"searchFreeBox\"]/div[2]/div[2]/span/b")).click();
        Thread.sleep(1000);

        Select ctgr = new Select(driver.findElement(By.name("category")));
        ctgr.selectByValue("41");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"searchBox\"]/div[2]/div[3]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("acc_81")).click();
        driver.findElement(By.id("acc_85")).click();
        driver.findElement(By.className("ok")).click();
        Thread.sleep(1000);

        Select rooms = new Select(driver.findElement(By.id("selRooms")));
        rooms.selectByValue("9");
        Thread.sleep(1000);

        driver.findElement(By.className("submitSearch")).click();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.xpath("//h3[@class='sectionTtl']")).getText());

        List<WebElement> results = driver.findElements(By.xpath("//*[@id=\"boxWrapperResults\"]//a[@class='vilaName']"));
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i).getText());
        }
        Thread.sleep(1000);
        driver.quit();

    }
}
