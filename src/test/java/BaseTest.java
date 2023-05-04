import com.mindcurv.framework.DriverManager;
import com.mindcurv.framework.OptionsManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    OptionsManager optionsManager = new OptionsManager();
    DriverManager driverManager = new DriverManager();

    public void navigateToW3Schools() {

        try {
            URL url = new URL("https://www.w3schools.com/");
            DriverManager.getDriver().navigate().to(url);
        } catch (MalformedURLException e) {
            System.out.println("URL is not working");
        }
    }

    public void navigateToExplicitWaitWebsite() {

        try {
            URL url = new URL("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
            DriverManager.getDriver().navigate().to(url);
        } catch (MalformedURLException e) {
            System.out.println("URL is not working");
        }
    }

    public void navigateToURL(String url) {
        DriverManager.getDriver().navigate().to(url);

    }

    @BeforeMethod
    public void beforeMethod() {
        driverManager.openBrowser();
        navigateToURL("https://www.flipkart.com/");
    }


    @AfterMethod
    public void afterMethod() {
        DriverManager.closeBrowser();
    }


    public void takeScreenShot() {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        TakesScreenshot scrShot = ((TakesScreenshot) DriverManager.getDriver());
        File screenshot = scrShot.getScreenshotAs(OutputType.FILE);
// Use a file utility library to save the screenshot to a desired location
        try {
            FileUtils.copyFile(screenshot, new File("C://Users//DragonWarrior-PC//eclipse-workspace//MindCurv_Automation//Output" + "//" + timeStamp + ".png"));
        } catch (IOException e) {

        }

    }


}
