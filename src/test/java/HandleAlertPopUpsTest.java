import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class HandleAlertPopUpsTest extends  BaseTest{

    @Test
    public void Test17_workWithAlertPopups() throws Exception {


        navigateToURL("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        WebElement alertButton = DriverManager.getDriver().findElement(By.name("alert"));
        alertButton.click();
        Thread.sleep(5000);
        //For informational Alerts , which only have OK button with some information
        DriverManager.getDriver().switchTo().alert().accept();

        Thread.sleep(2000);

        WebElement confirmationButton = DriverManager.getDriver().findElement(By.name("confirmation"));
        confirmationButton.click();
        Thread.sleep(2000);
        //For informational Alerts , with OK and Cancel Button on the Alert
        // To Click on OK Button
        DriverManager.getDriver().switchTo().alert().accept();

        Thread.sleep(2000);

        confirmationButton.click();
        Thread.sleep(2000);
        // To Click on Cancel Button
        DriverManager.getDriver().switchTo().alert().dismiss();

        Thread.sleep(2000);

        WebElement promptButton = DriverManager.getDriver().findElement(By.name("prompt"));
        promptButton.click();
        Thread.sleep(2000);
        //For informational Alerts , with OK and Cancel Button on the Alert
        // To Click on OK Button
        DriverManager.getDriver().switchTo().alert().sendKeys("This is Prompt Alert Test");
        DriverManager.getDriver().switchTo().alert().accept();

        Thread.sleep(5000);

    }
    @Test
    public void Test18_workWith_PromptAlertPopups() throws Exception {


        navigateToURL("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");



        WebElement promptButton = DriverManager.getDriver().findElement(By.name("prompt"));
        promptButton.click();
        Thread.sleep(2000);
        //For informational Alerts , with OK and Cancel Button on the Alert
        // To Click on OK Button
        Alert alert = DriverManager.getDriver().switchTo().alert();

        String alertText = alert.getText();

        System.out.println("Alert Text :: " + alertText);

        alert.sendKeys("This is Prompt Alert Test");
        Thread.sleep(2000);
        DriverManager.getDriver().switchTo().alert().accept();




        Thread.sleep(5000);

    }

}
