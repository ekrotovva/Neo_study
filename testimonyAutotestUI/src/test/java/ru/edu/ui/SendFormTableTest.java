package ru.edu.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class SendFormTableTest extends TestBase {

    @Test
    public void fromMainFillSubmitAndCheckTableIsNotEmpty() {
        applicationManager.getMainPage().clickSend();

        SendFormPage sendForm = new SendFormPage(applicationManager.getDriver());

        sendForm.fillWithDefaults();

        sendForm.submit();

        new WebDriverWait(applicationManager.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(sendForm.tableElement()));

        Table table = new Table(sendForm.tableElement(), applicationManager.getDriver());
        List<List<WebElement>> rows = table.getRowsWithColumns();

        for (int r = 0; r < rows.size(); r++) {
            List<WebElement> cols = rows.get(r);
            for (int c = 0; c < cols.size(); c++) {
                String cell = cols.get(c).getText();
                Assertions.assertFalse(cell == null || cell.trim().isEmpty(),
                        () -> String.format("Пустая ячейка в таблице: row=%d col=%d", r, c));
            }
        }
    }
}