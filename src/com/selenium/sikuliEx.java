package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class sikuliEx {
    public static void main(String[] args) throws FindFailed, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jobmaster.co.il/");

        Screen scn = new Screen();

        scn.type("C:\\Users\\ninog\\Desktop\\QA-Automation\\lesson3\\src\\com\\selenium\\Stype.png", "QA");
        scn.click("C:\\Users\\ninog\\Desktop\\QA-Automation\\lesson3\\src\\com\\selenium\\Sbtn.png");
        Thread.sleep(1000);




    }
}
