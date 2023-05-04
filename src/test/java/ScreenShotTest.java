import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScreenShotTest extends BaseTest{

    @Test
    public void Test11_findElementsUsing_ExplicitWait() throws Exception {
        String expectedText = "Learn To Code";
        navigateToExplicitWaitWebsite();

        WebElement seleniumTextButton= DriverManager.getDriver().findElement(By.xpath("//*[@id='populate-text']"));
        seleniumTextButton.click();
        WebElement actualseleniumText =DriverManager.getDriver().findElement(By.xpath("//h2[@id='h2']"));
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));

        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"),"Selenium Webdriver"));
        takeScreenShot();
        System.out.println(actualseleniumText.getText());
        Assert.assertEquals(actualseleniumText.getText(),"Selenium Webdriver","Text after clicking the button should be Selenium WebDriver");





    }



}
