package com.selenium;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class excelLogin {

    static String path = "C:\\Users\\ninog\\Downloads\\excel_test.xlsx";

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://danielauto.net/practice/loginPage/loginpageTest.html");

        String value;
        String username = "admin";
        String[] pass = {"12345", "pass", "", "admin"};

        WebElement user = driver.findElement(By.id("uaertName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement send = driver.findElement(By.id("send"));

        //try1
        try {
            user.sendKeys(username);
            password.sendKeys(pass[0]);
            send.click();

            if(driver.getPageSource().contains("You have entered incorrect details")){
                System.out.println("The username and pass are wrong");
                value = "failed";
            } else{
                System.out.println("The username and pass are correct");
                value = "passed";
            }
            excelPrint(path, value, 3, 1, 2);
        } catch (Exception e) {
            value = "Test failed";
            excelPrint(path, value, 3, 1, 2);
        }
        //try2
        try {
            driver.get("https://danielauto.net/practice/loginPage/loginpageTest.html");
            Thread.sleep(500);
            user = driver.findElement(By.id("uaertName"));
            password = driver.findElement(By.id("password"));
            send = driver.findElement(By.id("send"));

            user.sendKeys(username);
            password.sendKeys(pass[1]);
            send.click();
            Thread.sleep(500);

            if(driver.getPageSource().contains("You have entered incorrect details")){
                System.out.println("The username and pass are wrong");
                value = "failed";
            } else{
                System.out.println("The username and pass are correct");
                value = "passed";
            }
            excelPrint(path, value, 3, 2, 2);
        } catch (Exception e) {
            value = "Test failed";
            excelPrint(path, value, 3, 2, 2);
        }
        //try3
        try {
            driver.get("https://danielauto.net/practice/loginPage/loginpageTest.html");
            user = driver.findElement(By.id("uaertName"));
            password = driver.findElement(By.id("password"));
            send = driver.findElement(By.id("send"));

            user.sendKeys(username);
            password.sendKeys(pass[2]);
            send.click();
            Thread.sleep(500);

            if(driver.getPageSource().contains("You have entered incorrect details")){
                System.out.println("The username and pass are wrong");
                value = "failed";
            } else{
                System.out.println("The username and pass are correct");
                value = "passed";
            }
            excelPrint(path, value, 3, 3, 2);
        } catch (Exception e) {
            value = "Test failed";
            excelPrint(path, value, 3, 3, 2);
        }
        //try4
        try {
            driver.get("https://danielauto.net/practice/loginPage/loginpageTest.html");
            user = driver.findElement(By.id("uaertName"));
            password = driver.findElement(By.id("password"));
            send = driver.findElement(By.id("send"));

            user.sendKeys(username);
            password.sendKeys(pass[3]);
            send.click();

            if(driver.getPageSource().contains("You have entered incorrect details")){
                System.out.println("The username and pass are wrong");
                value = "failed";
            } else{
                System.out.println("The username and pass are correct");
                value = "passed";
            }
            excelPrint(path, value, 3, 4, 2);
            Thread.sleep(500);
            driver.quit();
        } catch (Exception e) {
            value = "Test failed";
            excelPrint(path, value, 3, 4, 2);
            Thread.sleep(500);
            driver.quit();
        }
    }


    public static void excelPrint(String filePath, String value, int sheetNumber, int rowNumber, int cellNumber) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(sheetNumber);
        Row row = sheet.getRow(rowNumber);
        if (row == null) {
            row = sheet.createRow(rowNumber);
        }
        Cell cell = row.getCell(cellNumber);
        if (cell == null) {
            cell = row.createCell(cellNumber);
        }
        cell.setCellValue(value);
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}

