package ru.edu.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Element {

    private final By dataSend = By.xpath("//*[@id=\"send_button\"]");
    private final By dataHistory = By.xpath("//*[@id=\"history_button\"]");
    private final By catalog = By.xpath("//*[@id=\"catalog_button\"]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public SendPage clickSend() {
        click(find(dataSend));
        return new SendPage(driver);
    }

    public HistoryPage clickHistory() {
        click(find(dataHistory));
        return new HistoryPage(driver);
    }

    public PricePage clickPrice() {
        click(find(catalog));
        return new PricePage(driver);
    }
}
