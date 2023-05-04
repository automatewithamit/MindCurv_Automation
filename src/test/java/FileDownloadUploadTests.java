import com.mindcurv.framework.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FileDownloadUploadTests extends BaseTest {

    @Test
    public void Test19_workWith_FileUpload() throws Exception {

        navigateToURL("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        //https:///the-internet.herokuapp.com/upload

        WebElement chooseFileButton = DriverManager.getDriver().findElement(By.name("upload"));
        chooseFileButton.sendKeys("C://Users//DragonWarrior-PC//eclipse-workspace//MindCurv_Automation//Output//" + "2023.05.03.15.52.11.png");//path of file


        Thread.sleep(5000);

    }

    @Test
    public void Test20_workWith_FileDownload_DefaultLocation() throws Exception {


        navigateToURL("https://the-internet.herokuapp.com/download");
        WebElement resumeDownloadLink = DriverManager.getDriver().findElement(By.xpath("//a[.='resume.pdf']"));
        resumeDownloadLink.click();
        Thread.sleep(5000);

    }

    @Test
    public void Test21_workWith_FileDownload_CustomLocation() throws Exception {



        navigateToURL("https://the-internet.herokuapp.com/download");



        WebElement resumeDownloadLink = DriverManager.getDriver().findElement(By.xpath("//a[.='resume.pdf']"));
        resumeDownloadLink.click();


        Thread.sleep(5000);

    }

}
