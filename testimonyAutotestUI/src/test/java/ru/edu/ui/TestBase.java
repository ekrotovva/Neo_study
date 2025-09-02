package ru.edu.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    protected ApplicationManager applicationManager;

    @BeforeEach
    public void setUp() throws Exception {
        applicationManager = new ApplicationManager();
        applicationManager.init();
    }

    @AfterEach
    public void tearDown() {
        applicationManager.close();
    }
}
