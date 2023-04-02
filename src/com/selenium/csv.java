package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csv {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        List<String> line = readCsv();

        for (int i = 1; i < line.size(); i++) {
            String [] split = line.get(i).split(",");
            driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");
            driver.findElement(By.id("uaertName")).sendKeys(split[0]);
            driver.findElement(By.id("password")).sendKeys(split[1]);
            Thread.sleep(2000);
            driver.findElement(By.id("send")).click();
            Thread.sleep(2000);
        }
        driver.quit();

    }


    public static List readCsv() throws IOException {
        List lines = new ArrayList();
        File file = new File("C:\\Users\\ninog\\Desktop\\QA-Automation\\AutomationCourse\\src\\com\\selenium\\csv_test.csv");
        lines = FileUtils.readLines(file);
        return lines;
    }

}
