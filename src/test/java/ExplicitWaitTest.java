import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitTest extends BaseTest{

    @Test
    public void Test9_findElementsUsing_ExplicitWait() throws Exception {
        String expectedText = "Learn To Code";
        navigateToExplicitWaitWebsite();

        WebElement seleniumTextButton=DriverManager.getDriver().findElement(By.xpath("//*[@id='populate-text']"));
        seleniumTextButton.click();
        WebElement actualseleniumText =DriverManager.getDriver().findElement(By.xpath("//h2[@id='h2']"));
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));

wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"),"Selenium Webdriver"));

        System.out.println(actualseleniumText.getText());
        Assert.assertEquals(actualseleniumText.getText(),"Selenium Webdriver","Text after clicking the button should be Selenium WebDriver");

      //Click on the Change Text to Selenium Webdriver Button
        //Wait for Text to change to Selenium WebDriver
        //Verify if the new text changed to Selenium WebDriver



    }

    @Test
    public void Test10_findElementsUsing_FluentWait() throws Exception {
        String expectedText = "Learn To Code";

        navigateToExplicitWaitWebsite();

        WebElement seleniumTextButton=DriverManager.getDriver().findElement(By.xpath("//*[@id='populate-text']"));
        seleniumTextButton.click();
        WebElement actualseleniumText =DriverManager.getDriver().findElement(By.xpath("//h2[@id='h2']"));

        Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverManager.getDriver())
                                                                        .withTimeout(Duration.ofSeconds(20))
                                                                        .pollingEvery(Duration.ofSeconds(5))
                                                                        .ignoring(NoSuchElementException.class);

        // wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));

        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"),"Selenium Webdriver"));

        System.out.println(actualseleniumText.getText());
        Assert.assertEquals(actualseleniumText.getText(),"Selenium Webdriver","Text after clicking the button should be Selenium WebDriver");

        //Click on the Change Text to Selenium Webdriver Button
        //Wait for Text to change to Selenium WebDriver
        //Verify if the new text changed to Selenium WebDriver



    }

}
