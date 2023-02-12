package com.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class googleTranslateEx {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://translate.google.com/");
        driver.findElement(By.className("er8xn")).sendKeys("שלום, שמי נינו");
        //driver.findElement(By.className("VfPpkd-Bz112c-RLmnJb")).click();
        //List<WebElement> languages = driver.findElements(By.className("Llmcnf"));
        //System.out.println(languages.size());
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.className("VfPpkd-Bz112c-RLmnJb")).click();
            List<WebElement> languages = driver.findElements(By.className("Llmcnf"));
            System.out.println(languages.size());

            languages.get(i).click();
            System.out.println(driver.findElement(By.className("ryNqvb")).getText());
            driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[2]/div/div[8]/div/div[4]/div[1]/div[2]/span/button/div[3]")).click();
            Thread.sleep(3000);

        }


    }
}
