package org.projectA.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

    public static WebDriver webDriver;

    @BeforeClass
    public void setUp() {
       webDriver = new ChromeDriver();
    }

    @AfterClass
    public void close() {
        webDriver.quit();
    }
}
