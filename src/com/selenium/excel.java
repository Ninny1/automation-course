package com.selenium;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class excel {

    static String path = "C:\\Users\\ninog\\Downloads\\excel_test.xlsx";

    public static void main(String[] args) throws IOException, InterruptedException {

        try {

            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("test");
            int FirstRow = sheet.getFirstRowNum();
            int LastRow = sheet.getLastRowNum();

            String value;
            String cell_value;

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://google.com");

            for (int i = FirstRow + 1; i <= LastRow; i++) {
                try {
                    XSSFRow row_r = sheet.getRow(i);
                    XSSFCell cell_r = row_r.getCell(0);
                    value = cell_r.getStringCellValue();
                    Thread.sleep(500);
                    driver.findElement(By.name("q")).clear();
                    Thread.sleep(1000);
                    driver.findElement(By.name("q")).sendKeys(value + Keys.ENTER);
                    Thread.sleep(1000);

                    cell_value = driver.findElement(By.xpath("(//div[@class='VwiC3b yXK7lf MUxGbd yDYNvb lyLwlc lEBKkf'])[1]")).getText();
                    excelPrint(path, cell_value, 0, i, 1);

                } catch (Exception e) {
                    System.out.println("Failed to read/write Excel!");
                }
            }

            Thread.sleep(500);
            driver.quit();

        } catch(Exception e){
            System.out.println("Failed to run the exercise!");
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