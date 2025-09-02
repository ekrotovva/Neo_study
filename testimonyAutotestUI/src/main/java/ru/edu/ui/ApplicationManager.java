package ru.edu.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    private WebDriver driver;

    private MainPage mainPage;
    private SendPage sendPage;
    private HistoryPage historyPage;
    private PricePage pricePage;

    public void init() throws InterruptedException {
        // chromedriver path should be supplied via env WEBDRIVER_CHROME_DRIVER or system property
        if (System.getProperty("webdriver.chrome.driver") == null) {
            String env = System.getenv("WEBDRIVER_CHROME_DRIVER");
            if (env != null) {
                System.setProperty("webdriver.chrome.driver", env);
            }
        }
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        Thread.sleep(1000);

        mainPage = new MainPage(driver);
        sendPage = new SendPage(driver);
        historyPage = new HistoryPage(driver);
        pricePage = new PricePage(driver);
    }

    public WebDriver getDriver() { return driver; }

    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }

    public MainPage getMainPage() { return mainPage; }
    public SendPage getSendPage() { return sendPage; }
    public HistoryPage getHistoryPage() { return historyPage; }
    public PricePage getPricePage() { return pricePage; }
}
