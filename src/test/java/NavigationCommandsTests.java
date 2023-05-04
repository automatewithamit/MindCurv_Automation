import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class NavigationCommandsTests extends  BaseTest{

    @Test
    public void  Test4_navigateToURL() throws Exception{

        //Navigation Commands
        URL url = new URL("https://www.w3schools.com/");
        //DriverManager.getDriver().navigate().to("https://www.w3schools.com/");
        DriverManager.getDriver().navigate().to(url);
        DriverManager.getDriver().navigate().back();
        System.out.println("Navigating Back");
        Thread.sleep(2000);
        DriverManager.getDriver().navigate().forward();
        System.out.println("Forwarding Back");
        Thread.sleep(2000);
        DriverManager.getDriver().navigate().refresh();
        System.out.println("Refreshing the Browser");

    }


}
