package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class actionExercises {
    public static void main(String[] args) throws InterruptedException, IOException {

        // #1
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("http://marcojakob.github.io/dart-dnd/basic/");
        Thread.sleep(1000);
        List<WebElement> draggableList = driver1.findElements(By.xpath("//img[@class='document']"));
        System.out.println(draggableList.size());
        WebElement droppable = driver1.findElement(By.className("trash"));
        for (int i = 0; i < draggableList.size(); i++) {
            WebElement draggable = draggableList.get(i);
            new Actions(driver1).dragAndDrop(draggable, droppable).perform();
        }
        Thread.sleep(2000);
        driver1.quit();

        // #2
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://danielauto.net/practice/action/multipick.html");
        Thread.sleep(1000);

        List<WebElement> list = driver.findElements(By.xpath("//select//option"));
        System.out.println(list.size());
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).click(list.get(0)).click(list.get(2)).keyUp(Keys.SHIFT).perform();
        Thread.sleep(1000);
        File scrFileA = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFileA, new File("d:\\A.png"));
        action.keyDown(Keys.CONTROL).click(list.get(1)).click(list.get(2)).click(list.get(4)).keyUp(Keys.CONTROL).perform();
        Thread.sleep(1000);
        File scrFileB = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFileB, new File("d:\\B.png"));

        // #3
        WebElement doubleClickElement = driver.findElement(By.id("dbl_click"));
        action.doubleClick(doubleClickElement).perform();
        Thread.sleep(1000);

        // #4
        WebElement mouseOver = driver.findElement(By.id("over"));
        action.moveToElement(mouseOver).build().perform();
        Thread.sleep(1000);
        WebElement outOfBox = driver.findElement(By.id("dbl_click"));
        action.moveToElement(outOfBox).build().perform();
        action.moveToElement(mouseOver).build().perform();
        String counter =driver.findElement(By.id("demo2")).getText();
        if (counter.equals("2")) {
            System.out.println("המספר 2 מופיע");
        } else {
            System.err.println("המספר 2 אינו מופיע"); }
        System.out.println("targil 4 pass");
        Thread.sleep(1000);

        // #5
        WebElement dropdown = driver.findElement(By.id("mouseover"));
        action.moveToElement(dropdown).perform();
        WebElement subDropDown = driver.findElement(By.id("google"));
        action.click(subDropDown).perform();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.navigate().back();

        // #6
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"baby\"]/img"));
        File pic = logo.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pic,new File("d://baby.png"));




    }
}
