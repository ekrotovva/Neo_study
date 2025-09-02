package ru.edu.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.LocalDate;

public class SendFormPage extends Element {

    @FindBy(id = "date")     private WebElement date;
    @FindBy(id = "coldData") private WebElement coldData;
    @FindBy(id = "hotData")  private WebElement hotData;
    @FindBy(id = "gasData")  private WebElement gasData;
    @FindBy(id = "elecData") private WebElement elecData;
    @FindBy(id = "button")   private WebElement submit;

    @FindBy(id = "table")    private WebElement table; // сама таблица

    public SendFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); // инициализация @FindBy
    }

    /** Заполнить форму валидными данными (можно перегрузить метод с параметрами) */
    public SendFormPage fillWithDefaults() {
        date.clear();
        date.sendKeys(LocalDate.now().toString());
        coldData.sendKeys("123");
        hotData.sendKeys("45");
        gasData.sendKeys("7");
        elecData.sendKeys("890");
        return this;
    }

    public SendFormPage submit() {
        click(submit);
        return this;
    }

    public WebElement tableElement() {
        return table;
    }
}