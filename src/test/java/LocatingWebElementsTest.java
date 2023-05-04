import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatingWebElementsTest extends BaseTest {


    @Test
    public void Test5_findElementUsingClassName() {
        String expectedText = "Learn To Code";

        navigateToW3Schools();
        try {
            Thread.sleep(5000);
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        WebElement learnToCodeText = DriverManager.getDriver().findElement(By.className("learntocodeh1"));
        String actualText = learnToCodeText.getText();
        System.out.println("Actual Text :: " + actualText);
        WebElement subText = DriverManager.getDriver().findElement(By.className("learntocodeh3"));
        String actualSubText = subText.getText();
        System.out.println("Actual Sub Text :: " + actualSubText);

    }

    @Test
    public void Test6_findElementsUsingTagName() {
        String expectedText = "Learn To Code";

        navigateToW3Schools();

        List<WebElement> listOfH2Elements = DriverManager.getDriver().findElements(By.tagName("h2"));

//Print All the Texts contained by h2 Tag

        for (WebElement element : listOfH2Elements) {

            String h2Text = element.getText();
            System.out.println("H2 Text :: " + h2Text);
        }

        System.out.println("Count of the h2 Tags  :: " + listOfH2Elements.size());

    }

    @Test
    public void Test7_findElementsUsing_LinkText() throws Exception {
        String expectedText = "Learn To Code";

        navigateToW3Schools();

        WebElement linkTextElement = DriverManager.getDriver().findElement(By.linkText("Not Sure Where To Begin?"));

        System.out.println("Navigated to Next Page");

        linkTextElement.click();
        System.out.println("Clicked on the Link");
        Thread.sleep(5000);
        System.out.println("Waited for 5 Sec");
        DriverManager.getDriver().navigate().back();
        System.out.println("Navigated to the Previous page");
        Thread.sleep(2000);
        System.out.println("Waited for 2 Sec");
        //Close the Browser
        DriverManager.getDriver().close();
        System.out.println("Closed the Browser");


    }
    @Test
    public void Test8_findElementsUsing_PartialLinkText() throws Exception {
        String expectedText = "Learn To Code";

        navigateToW3Schools();

        WebElement linkTextElement = DriverManager.getDriver().findElement(By.partialLinkText("Sure Where"));

        System.out.println("Navigated to Next Page after clicking on partial link text");

        linkTextElement.click();
        System.out.println("Clicked on the partial Link");
        Thread.sleep(5000);
        System.out.println("Waited for 5 Sec");
        DriverManager.getDriver().navigate().back();
        System.out.println("Navigated to the Previous page");
        Thread.sleep(2000);
        System.out.println("Waited for 2 Sec");
        //Close the Browser
        DriverManager.getDriver().close();
        System.out.println("Closed the Browser");


    }



}
