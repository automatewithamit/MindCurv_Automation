package com.mindcurv.pages;

import com.mindcurv.framework.DriverManager;
import com.mindcurv.webelements.Button;
import com.mindcurv.webelements.Label;
import com.mindcurv.webelements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    Button requestOTPButton = new Button(By.xpath("//button[text()='Request OTP']"));
    TextBox loginTextBox = new TextBox(By.xpath("//a[.='New to Flipkart? Create an account']/../preceding-sibling::div/input"));
    Label errorLabel =new Label(By.xpath("//span[text()='Please enter valid Email ID/Mobile number']"));


    //By byErrorLabel = By.xpath("//span[text()='Please enter valid Email ID/Mobile number']");
    //By byRequestOTP = By.xpath("//button[text()='Request OTP']");
    //By byLoginTextBox = By.xpath("//a[.='New to Flipkart? Create an account']/../preceding-sibling::div/input");


    public void setMobileNumber(String textToSet){
       loginTextBox.setText(textToSet);
    }

    public String getErrorLabelText(){
        return errorLabel.getText();
    }

    public void clickRequestOTP(){
        requestOTPButton.clickJS();
    }




    //POM
     //Identifying the WebElements
        //Locators
        //find Element
    //Action you perform on the WebElements




}
