package com.angular;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://myhealth.stanfordhealthcare.org/#/");
        driver.manage().window().maximize();

        driver.findElement(ByAngular.model("id")).sendKeys("nino@gmail.com");
        driver.findElement(ByAngular.model("password")).sendKeys("password");
        driver.findElement(ByAngular.buttonText("Sign In")).click();

    }
}
