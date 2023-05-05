package com.mindcurv.pages;

import com.mindcurv.framework.DriverManager;
import com.mindcurv.webelements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {


    Button loginButton = new Button(By.xpath("//a[.='Login']"));
//    By byLoginButton = By.xpath("//a[.='Login']");

    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage();
    }

}
