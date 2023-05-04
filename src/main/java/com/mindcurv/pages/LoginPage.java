package com.mindcurv.pages;

import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    By byErrorLabel = By.xpath("//span[text()='Please enter valid Email ID/Mobile number']");
    By byRequestOTP = By.xpath("//button[text()='Request OTP']");
    By byLoginTextBox = By.xpath("//a[.='New to Flipkart? Create an account']/../preceding-sibling::div/input");
    public void setMobileNumber(String textToSet){
        WebElement loginTextBoxElement = DriverManager.getDriver().findElement(byLoginTextBox);
        loginTextBoxElement.sendKeys(textToSet);
    }

    public String getErrorLabelText(){
        WebElement errorLabel = DriverManager.getDriver().findElement(byErrorLabel);
        return errorLabel.getText();
    }

    public void clickRequestOTP(){
        WebElement requestOTPButton = DriverManager.getDriver().findElement(byRequestOTP);
        requestOTPButton.click();
    }

    //POM
     //Identifying the WebElements
        //Locators
        //find Element
    //Action you perform on the WebElements




}
