package com.mindcurv.pages;

import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    By byLoginButton = By.xpath("//a[.='Login']");

    public LoginPage clickLoginButton() {
        WebElement loginButton = DriverManager.getDriver().findElement(byLoginButton);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        return new LoginPage();
    }

}
