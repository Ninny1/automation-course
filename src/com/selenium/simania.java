package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.List;

public class simania {
    public static void main(String[] args) throws InterruptedException {
        /*
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://simania.co.il");
        driver.findElement(By.id("query")).sendKeys("אין ילדים רעים" + Keys.ENTER);
        //driver.findElement(By.className("clickable")).click();
        System.out.println(driver.findElement(By.linkText("מיכל דליות")).getText());
        driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/book-reviews/div/div[4]/button")).click();
        String str = driver.findElement(By.linkText("9 ביקורות על הספר")).getText();
        str = str.replaceAll("[^\\d.]", "");
        int number = Integer.parseInt(str);
        System.out.println(number);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='reviewWrapper']//div[@class='imageOverlay']"));
        System.out.println(list.size());
        for (WebElement webElement : list) {
            //System.out.println(webElement.getText());
            System.out.println(webElement.getAttribute("innerHTML").trim());
        }

         */
        /* תרגיל זיהוי אלמנטים -1
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stackoverflow.com/tags");
        List<WebElement> tagsList = driver.findElements(By.className("post-tag"));
        List<WebElement> questions = driver.findElements(By.xpath("//*[@id=\"tags-browser\"]//div[@class='mt-auto d-flex jc-space-between fs-caption fc-black-400']//div[@class='flex--item']\n"));
        for (int i = 0; i < tagsList.size(); i++) {

            System.out.println("In " + tagsList.get(i).getText() + " we have " + questions.get(i).getText());
        }

         */

        // תרגיל זיהוי אלמנטים - 2
        String[] arr;
        int counter = 0;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calauto.co.il/heb/wantbuy/searchresults/");
        List<WebElement> years = driver.findElements(By.xpath("//tr[@class='group']//td[@class='year ng-binding']"));
        for (int i = 0; i < years.size(); i++) {
            String str = years.get(i).getAttribute("innerHTML").trim();
            if(str.contains("-")){
                arr = str.split("\\s*-\\s*");
                for (int j = 0; j < arr.length; j++) {
                    int year = Integer.parseInt(arr[j]);
                    if (year <= 2014) {
                        System.out.println(year + " : no");
                        counter++;
                    }
                    if (year > 2014) {
                        System.out.println(year + " : yes");
                    }
                }
            }
            else if (Integer.parseInt(str) <= 2014) {
                System.out.println(Integer.parseInt(str) + " : no");
                counter++;
            }
            else {
                System.out.println(Integer.parseInt(str) + " : yes");
            }
        }
        System.out.println("I have " + counter + " cars under 2014");
        System.out.println("I tested " + years.size() + " cars");

        Thread.sleep(3000);
        driver.quit();

        }


    }

