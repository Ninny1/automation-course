package com.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NutritionCaloriesEx_elements {
    @FindBy(id="searchTxt")
    public WebElement searchTxt;

    @FindBy(id = "Button1")
    public WebElement btn;

    @FindBy(xpath = "//*[@id='serachResults']//option[1]")
    public WebElement searchResult;

    @FindBy(xpath = "//*[@id='serachResults']//option[4]")
    public WebElement searchResultOlives;

    @FindBy(xpath = "//*[@id=\"food_search_wrapper\"]/div[3]/table/tbody/tr/td[6]/input")
    public WebElement addBtn;

    @FindBy(id = "quantity")
    public WebElement quantity;

    @FindBy(className = "first")
    public List<WebElement> food_name;

    @FindBy(xpath = "//*[@id=\"foodsTable\"]/tbody/tr[2]/td[10]/a")
    public WebElement remove1Item;

    @FindBy(xpath = "//*[@id='serachResults']//option[6]")
    public WebElement searchResultHamaniot;

    @FindBy(xpath = "//*[@id=\"foodsSummery\"]/table/tbody/tr[3]/td[1]")
    public WebElement allCalories;

    @FindBy(xpath = "//*[@id=\"foodsTable\"]/tbody/tr[2]/td[7]")
    public WebElement firstItemCalories;

    @FindBy(xpath = "//*[@id=\"foodsTable\"]/tbody/tr[3]/td[7]")
    public WebElement secondItemCalories;

    @FindBy(xpath = "//*[@id=\"foodsSummery\"]/table/tbody/tr[3]/td[2]")
    public WebElement allCarbos;

    @FindBy(xpath = "//*[@id=\"foodsTable\"]/tbody/tr[2]/td[8]")
    public WebElement firstItemCarbo;

    @FindBy(xpath = "//*[@id=\"foodsTable\"]/tbody/tr[3]/td[8]")
    public WebElement secondItemCarbo;


}

