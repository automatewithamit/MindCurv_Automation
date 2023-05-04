package com.mindcurv.pages;

import com.mindcurv.framework.DriverManager;
import com.mindcurv.helper.PropertiesHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    PropertiesHelper locators = new PropertiesHelper("locators.properties");
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));

    public String getLocator(String webElementName) {
        locators.getProperty(webElementName);


        return "";

    }
}
