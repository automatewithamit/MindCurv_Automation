import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class MouseActionsTest extends BaseTest {


    @Test
    public void Test15_workWithMouseActions() throws Exception {
        String expectedText = "Learn To Code";

        navigateToURL("https://selenium08.blogspot.com/2020/01/drag-drop.html");


        Actions actions = new Actions(DriverManager.getDriver());


        WebElement draggable = DriverManager.getDriver().findElement(By.cssSelector("#draggable"));


        WebElement dropHere = DriverManager.getDriver().findElement(By.cssSelector("#droppable"));

//        actions.dragAndDrop( draggable,dropHere);
//        actions.build().perform();
        Thread.sleep(5000);
        actions.doubleClick(draggable);
        actions.build().perform();
        actions.contextClick(draggable);
        actions.build().perform();


        Thread.sleep(5000);

    }


}
