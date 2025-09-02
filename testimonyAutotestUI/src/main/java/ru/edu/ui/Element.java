package ru.edu.ui;

import org.openqa.selenium.By;

public class Element extends BasePage {

    private final By header = By.xpath("/html/body/h1");

    public Element(org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return find(header).getText();
    }
}
