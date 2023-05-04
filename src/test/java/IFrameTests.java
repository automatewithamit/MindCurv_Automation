import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.annotations.Test;

public class IFrameTests extends BaseTest {

    @Test
    public void Test16_workWithIFrames() throws Exception {
        String expectedText = "Learn To Code";

        navigateToURL("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");


        WebElement naukriIFrame = DriverManager.getDriver().findElement(By.xpath("//iframe[@name='iframe_b']"));


        DriverManager.getDriver().switchTo().frame(naukriIFrame);

        WebElement naukriLoginButton = DriverManager.getDriver().findElement(By.cssSelector("#login_Layer"));
        Actions actions = new Actions(DriverManager.getDriver());

        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromViewport(),100,100);
        naukriLoginButton.click();
        DriverManager.getDriver().switchTo().defaultContent();
        WebElement govtJobIFrame = DriverManager.getDriver().findElement(By.xpath("//iframe[@name='iframe_a']"));
        DriverManager.getDriver().switchTo().frame(govtJobIFrame);

        WebElement whatsAppbutton = DriverManager.getDriver().findElement(By.xpath("//img[@alt='Join Whatsapp Groups']"));
        whatsAppbutton.click();

        Thread.sleep(5000);

    }
}
