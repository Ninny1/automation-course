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
import java.security.Key;

//import static jdk.internal.org.jline.utils.InfoCmp.Capability.tab;

public class excel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\ninog\\Downloads\\excel_test.xlsx");
        String path = "C:\\Users\\ninog\\Downloads\\excel_test.xlsx";
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("test");
        int FirstRow = sheet.getFirstRowNum();
        int LastRow = sheet.getLastRowNum();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        for (int i = FirstRow; i <= LastRow; i++) {
            XSSFRow row_r = sheet.getRow(i+1);
            XSSFCell cell_r = row_r.getCell(0);
            String value = cell_r.getStringCellValue();
            //System.out.println(value);
            driver.findElement(By.className("gLFyf")).sendKeys(value + Keys.ENTER);
            String cell_value = driver.findElement(By.xpath("//*[@id='kp-wp-tab-overview']/div[1]/div/div/div/div/div/div[2]/div/span/text()")).getText();
            excelPrint(path,cell_value,i,1);
        }
    }

    public static void excelPrint(String filePath, String value, int rowNumber, int cellNumber) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.createSheet("Java Books");
        Row row = sheet.getRow(rowNumber);
        if (row == null) {
            row = sheet.createRow(rowNumber);
        }
        Cell cell = row.getCell(cellNumber);
        if (cell == null) {
            cell = row.createCell(cellNumber);
        }
        //cell.setCellValue(value);
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }


}
