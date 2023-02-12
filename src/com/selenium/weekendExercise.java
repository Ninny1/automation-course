package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DecimalFormat;
import java.util.List;

public class weekendExercise {
    public static void main(String[] args) throws InterruptedException {

        double average = 0, doubleScores = 0;
        boolean con = true;
        int count = 0;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://my.weekend.co.il/reviews.aspx?id=3094&lang=he");

        while (con) {
            List<WebElement> ratings = driver.findElements(By.xpath("//*[@class='grades4']"));
            count = count + ratings.size();
            for (int i = 0; i < ((List<?>) ratings).size(); i++) {
                String str = ratings.get(i).getText();
                str = str.trim();
                System.out.println(str);
                doubleScores = Double.parseDouble(str);
                average = average + doubleScores;
            }
            try {
                driver.findElement(By.className("pagingleft2")).click();
            } catch (Exception e) {
                con = false;
            }
        }

        System.out.println("-----------------------------");
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.err.println("The ratings average is: " + df.format(average/count));

        Thread.sleep(3000);
        driver.quit();
    }
}
