package ru.edu.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PageNavigationTest extends TestBase {

    @Test
    public void FromMainToSendAndBack() throws InterruptedException {
        applicationManager.getMainPage().clickSend();
        Assertions.assertEquals("Передача показаний", applicationManager.getSendPage().getHeaderText());
        Thread.sleep(1000); // оставляем согласно требованиям урока
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals("Neo ЖКХ", applicationManager.getMainPage().getHeaderText());
    }

    @Test
    public void FromMainToHistoryAndBack() throws InterruptedException {
        applicationManager.getMainPage().clickHistory();
        Assertions.assertEquals("История показаний", applicationManager.getHistoryPage().getHeaderText());
        Thread.sleep(1000);
        applicationManager.getHistoryPage().clickBackButton();
        Assertions.assertEquals("Neo ЖКХ", applicationManager.getMainPage().getHeaderText());
    }

    @Test
    public void FromMainToPriceAndBack() throws InterruptedException {
        applicationManager.getMainPage().clickPrice();
        Assertions.assertEquals("Справочник стоимости услуг", applicationManager.getPricePage().getHeaderText());
        Thread.sleep(1000);
        applicationManager.getPricePage().clickBackButton();
        Assertions.assertEquals("Neo ЖКХ", applicationManager.getMainPage().getHeaderText());
    }
}
