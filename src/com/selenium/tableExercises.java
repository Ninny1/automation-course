package com.selenium;
import java.text.DecimalFormat;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tableExercises {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        driver.get("https://danielauto.net/practice/tabls/tables.html");

        //test 1
        List<WebElement> num_rows = driver.findElements(By.xpath("//*[@id='tab']/tbody/tr"));
        System.out.println("Rows: " + num_rows.size());

        List<WebElement> num_cols = driver.findElements(By.xpath("//*[@id='tab']/tbody/tr[2]/td"));
        System.out.println("Columns: " + num_cols.size());

        // test 2
        List<WebElement> groupList = driver.findElements(By.xpath("//td[2]"));
        int countA = 0, countB = 0, countC = 0;

        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).getText().equals("A"))
                countA++;
            if (groupList.get(i).getText().equals("B"))
                countB++;
            if (groupList.get(i).getText().equals("C"))
                countC++;

        }
        System.out.println("A = " + countA + ", B = " + countB + ", C = " + countC);

        // test 3
        double maxPrice = 0;
        List<WebElement> priceBefore = driver.findElements(By.xpath("//td[3]"));
        for (int i = 0; i < priceBefore.size(); i++) {
            String text = priceBefore.get(i).getText();
            if (text.contains(",")) {
                text = text.replaceAll(",", "");
            }
            double num = Double.parseDouble(text);
            if (num > maxPrice) {
                maxPrice = num;
            }
        }
        System.out.println("Max price is: " + maxPrice);

        //test 4
        /*
        List<WebElement> companyName = driver.findElements(By.xpath("//td[1]"));
        for (int i = 0; i < companyName.size(); i++) {
            String company = companyName.get(i).getText();
            if (company.charAt(0) == '.'){
                company = company.replaceAll(".", "");
                if (Character.toLowerCase(company.charAt(0)) == 'a') {
                    System.out.println("Company: " + company);
                }
            }
            if (Character.toLowerCase(company.charAt(0)) == 'a') {
                System.out.println("Company: " + company);
            }

        }

         */

        //test 5
        List<WebElement> companyName = driver.findElements(By.xpath("//td[1]"));
        List<WebElement> groupName = driver.findElements(By.xpath("//td[2]"));
        for (int i = 0; i < companyName.size(); i++) {
                String company = companyName.get(i).getText();
                if (company.charAt(0) == '.') {
                    company = company.replaceAll(".", "");
                    if (Character.toLowerCase(company.charAt(0)) == 'a') {
                        if (groupName.get(i).getText().equals("C")) {
                            System.out.println("Company and groupC: " + company);
                        }
                    }
                }
                if (Character.toLowerCase(company.charAt(0)) == 'a') {
                    if (groupName.get(i).getText().equals("C")) {
                        System.out.println("Company and groupC: " + company);
                    }
                }

            }

        //test 6
        List<WebElement> changes = driver.findElements(By.xpath("//td[5]"));
        double allChanges = 0, changesNum = 0;
        for (int i = 0; i < changes.size(); i++) {
            String changesStr = changes.get(i).getText().replaceAll(" +", "");;
            changesNum = Double.parseDouble(changesStr);
            allChanges = changesNum + allChanges;
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println(df.format(allChanges));
    }
}


