package ru.edu.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class Table {
    private final WebElement tableElement;
    private final WebDriver driver;

    public Table(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }

    public List<WebElement> getRows() {
        return tableElement.findElements(By.xpath(".//tr"));
    }

    public List<List<WebElement>> getRowsWithColumns() {
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<>();
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.xpath(".//td"));
            rowsWithColumns.add(cols);
        }
        return rowsWithColumns;
    }

    public String getValueFromCell(int row, int col) {
        return getRowsWithColumns().get(row).get(col).getText();
    }
}
