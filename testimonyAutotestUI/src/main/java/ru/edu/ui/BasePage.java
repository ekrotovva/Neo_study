package ru.edu.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected WebElement find(By by) {
        return driver.findElement(by);
    }
}
