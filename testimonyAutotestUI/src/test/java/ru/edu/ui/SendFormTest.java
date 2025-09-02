package ru.edu.ui;

import org.junit.jupiter.api.Test;

public class SendFormTest extends TestBase {

    @Test
    public void fromMainFillAndSendForm() throws InterruptedException {
        applicationManager.getMainPage().clickSend();

        SendFormPage formPage = new SendFormPage(applicationManager.getSendPage().driver);
        formPage.fillForm();

        Thread.sleep(1000); 

        formPage.submitForm();

        Thread.sleep(2000);
    }
}