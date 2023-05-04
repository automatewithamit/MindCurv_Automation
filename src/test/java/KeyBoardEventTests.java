import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Set;

public class KeyBoardEventTests extends BaseTest {


    @Test
    public void Test12_workWithTextBoxes() throws Exception {
        String expectedText = "Learn To Code";
        navigateToW3Schools();

        WebElement textBox = DriverManager.getDriver().findElement(By.cssSelector("#search2"));
        textBox.sendKeys("Java Script Part 1");
        Thread.sleep(5000);
        textBox.clear();
        Thread.sleep(5000);
        textBox.sendKeys("Java Script Part 2");
        Thread.sleep(5000);
        textBox.sendKeys(Keys.TAB);
        Thread.sleep(5000);
        textBox.sendKeys(Keys.ENTER);

        textBox.clear();

        Thread.sleep(5000);

        //WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));

        //wait.wait(5000);
//        textBox.click();
//        WebElement actualseleniumText =DriverManager.getDriver().findElement(By.xpath("//h2[@id='h2']"));
//
//        takeScreenShot();
//        System.out.println(actualseleniumText.getText());
//        Assert.assertEquals(actualseleniumText.getText(),"Selenium Webdriver","Text after clicking the button should be Selenium WebDriver");
//


    }


    @Test
    public void Test13_workWithButtons() throws Exception {
        String expectedText = "Learn To Code";

        navigateToW3Schools();

        WebElement signInButton = DriverManager.getDriver().findElement(By.cssSelector("#myLearningFromDefault"));


        //Hovering


        //Get Text of Button
        String buttonName = signInButton.getText();
        System.out.println("Button Name :: " + buttonName);
        //getattribute
        String hrefURLInButton = signInButton.getAttribute("href");
        System.out.println("href URL :: " + hrefURLInButton);
        //Click
        signInButton.click();

        Thread.sleep(5000);


    }

    @Test
    public void Test14_workWithButtonsAndWindowHandles() throws Exception {
        String expectedText = "Learn To Code";

        navigateToW3Schools();

        WebElement signInButton = DriverManager.getDriver().findElement(By.cssSelector("#myLearningFromDefault"));


        //Hovering


        //Get Text of Button
        String buttonName = signInButton.getText();
        System.out.println("Button Name :: " + buttonName);
        //getattribute
        String hrefURLInButton = signInButton.getAttribute("href");
        System.out.println("href URL :: " + hrefURLInButton);
        String oldWindow = DriverManager.getDriver().getWindowHandle();
        //Click
        signInButton.click();

        Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();

        String currentWindow = DriverManager.getDriver().getWindowHandle();

        //DriverManager.driver.switchTo().window(currentWindow);
        for (String handle : windowHandles) {
            if (!handle.equalsIgnoreCase(currentWindow)) {
                //Switch to the opened tab
                DriverManager.getDriver().switchTo().window(handle);
            }
        }
        WebElement email = DriverManager.getDriver().findElement(By.cssSelector("#modalusername"));
        email.sendKeys("abc@gmail.com");
        WebElement password = DriverManager.getDriver().findElement(By.cssSelector("#new-password"));
        password.sendKeys("Learning@123");
        WebElement signupButton = DriverManager.getDriver().findElement(By.xpath("//span[.='Sign up for free']/parent::*"));
        signupButton.click();
        DriverManager.getDriver().close();
        Thread.sleep(5000);
        DriverManager.getDriver().switchTo().window(oldWindow);

        WebElement searchBox = DriverManager.getDriver().findElement(By.cssSelector("#search2"));
        searchBox.sendKeys("We are done with changes");


    }



}
