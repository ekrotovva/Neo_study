package ru.edu.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;

public class SendFormPage extends Element {

    private final By dateField = By.id("date");
    private final By coldField = By.id("coldData");
    private final By hotField = By.id("hotData");
    private final By gasField = By.id("gasData");
    private final By elecField = By.id("elecData");
    private final By submitButton = By.id("button");

    public SendFormPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm() {
        // сегодня
        driver.findElement(dateField).sendKeys(LocalDate.now().toString());
        driver.findElement(coldField).sendKeys("123");
        driver.findElement(hotField).sendKeys("45");
        driver.findElement(gasField).sendKeys("7");
        driver.findElement(elecField).sendKeys("890");
    }

    public void submitForm() {
        click(find(submitButton));
    }
}