package com.mindcurv.framework;

import com.mindcurv.helper.PropertiesHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Locale;

public class DriverManager {
    OptionsManager optionsManager = new OptionsManager();
    private static WebDriver driver;
    PropertiesHelper runConfigProperties = new PropertiesHelper("runConfig.properties");

    public void openBrowser() {


        String projectPath = System.getProperty("user.dir");
        String customDownloadLocation = projectPath + "//Output//";
        String browserName = runConfigProperties.getProperty("browserName").toLowerCase();
        System.out.println("Starting " + browserName + " Browser...");
        switch (browserName) {
            case "chrome":
                DriverManager.driver = new ChromeDriver(optionsManager.getChromeOptions());

                break;
            case "edge":
                DriverManager.driver = new EdgeDriver(optionsManager.getEdgeOptions());
                break;
            default:
                System.out.println(browserName + " Browser is not Available");
        }


        //ChromeOptions options = new ChromeOptions();
//        Map<String, Object> browserPref = new HashMap<String, Object>();
//        //Key Value Pair
//        //Get the Values based on Keys
//        //Don't mantain the order of insertion
//        //We can iterate through the key value pairs
//        //holds only unique keys
//        //we use Wrapper classes instead of primitive types
//        //browserPref.put("profile.default_content_settings.popups", 0);
//        browserPref.put("download.default_directory", customDownloadLocation);
//
//        options.setExperimentalOption("pref",browserPref);


        DriverManager.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //This helps to maximize the Browser window
        DriverManager.getDriver().manage().window().maximize();

    }

    public static WebDriver getDriver() {
        return driver;
    }


    public static void closeBrowser() {
        DriverManager.getDriver().quit();
    }


}
