package ru.edu.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HistoryPage extends Element {
    private final By backButton = By.xpath("//*[@id=\"back_button\"]");

    public HistoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickBackButton() {
        click(find(backButton));
    }
}
