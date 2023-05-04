import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SetUpChromeDriverTests extends  BaseTest {


    @Test
    public void Test1_OlderWayToSetUpChromeDriver() {
        //Open Chrome Browser

//Setting system properties of ChromeDriver
//System.setProperty("webdriver.chrome.driver", "C://Users//DragonWarrior-PC//eclipse-workspace//MindCurv_Automation//Drivers//chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C://Users//DragonWarrior-PC//eclipse-workspace//MindCurv_Automation//Drivers//msedgedriver.exe");

//Creating an object of ChromeDriver
        WebDriver edgeDriver = new EdgeDriver();
        //WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();
        //Navigate to Website Under Test ->  https://www.w3schools.com/
        //Click on Tutorials Section
        //Click on ‘Learn HTML’
        //If “HTML Tutorial” is available on the page then it is verified that upon clicking HTML Link HTML Page has been opened

    }

    @Test
    public void Test2_OpeningChromeBrowserUsingWebDriverManager() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriver edgeDriver = new EdgeDriver();


    }

    @Test
    public void Test3_OpeningChromeBrowserUsingSeleniumManager() {
        WebDriver driver = new ChromeDriver();
        WebDriver edgeDriver = new EdgeDriver();
    }
}
