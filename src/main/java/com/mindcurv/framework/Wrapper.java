package com.mindcurv.framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wrapper {

    public WebElement findElement(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement element = null;

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            element = DriverManager.getDriver().findElement(by);
            System.out.println("Found the Element");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found");
        }
        return element;
    }
    public void clickJS(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement element = null;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            element = findElement(by);
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", element);
            System.out.println("Clicked the Element");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element Could not been Clicked as there was some other Element tried to hide it");
        } catch (NoSuchElementException e) {
            System.out.println("Element Could not been Found");
        } catch (Exception e) {
            System.out.println("Exception Occurred while Clicking....");
        }


    }

    public void click(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement element = null;

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            element = findElement(by);
            element.click();
            System.out.println("Clicked the Element");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element Could not been Clicked as there was some other Element tried to hide it");
        } catch (NoSuchElementException e) {
            System.out.println("Element Could not been Found");
        } catch (Exception e) {
            System.out.println("Exception Occurred while Clicking....");
        }
    }

    public void setText(By by, String text) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement element = null;

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            element = DriverManager.getDriver().findElement(by);
            element.sendKeys(text);
            System.out.println("Text box got set using " + text + "Text");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element Could not been Clicked as there was some other Element tried to hide it");
        } catch (NoSuchElementException e) {
            System.out.println("Element Could not been Found");
        } catch (Exception e) {
            System.out.println("Exception Occurred while Clicking....");
        }
    }

    public String getText(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement element = null;
        String text = "";
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            element = DriverManager.getDriver().findElement(by);
            text = element.getText();

        } catch (ElementClickInterceptedException e) {
            System.out.println("Element Could not been Clicked as there was some other Element tried to hide it");
        } catch (NoSuchElementException e) {
            System.out.println("Element Could not been Found");
        } catch (Exception e) {
            System.out.println("Exception Occurred while Clicking....");
        }
        return text;
    }

}
