package com.mindcurv.framework;


import com.mindcurv.helper.PropertiesHelper;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

//This class is needed to manage different Browser options
//Options class helps to manage different Browser Settings
public class OptionsManager {
    PropertiesHelper runConfigProperties = new PropertiesHelper("runConfig.properties");

    public ChromeOptions getChromeOptions() {

//     start-maximized: Used to open Chrome in maximize mode
//     incognito: Used to open Chrome in incognito mode
//     --headless : Used to open Chrome in headless mode
//     disable-extensions: Used to disable existing extensions on Chrome browser
//     disable-popup-blocking: Used to disable pop-ups displayed on Chrome browser
//     make-default-browser: Used to make Chrome as default browser
//     version: Used to print chrome browser version
//     disable-infobars: Used to prevent Chrome from displaying the notification.
        ChromeOptions options = new ChromeOptions();
        if (Boolean.parseBoolean(runConfigProperties.getProperty("headless"))) {
            options.addArguments("--headless");
        }

        return options;
    }

    public EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();

        if (Boolean.parseBoolean(runConfigProperties.getProperty("headless"))) {
            options.addArguments("--headless");
        }

        return options;
    }


}
