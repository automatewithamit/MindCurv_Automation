import com.mindcurv.pages.HomePage;
import com.mindcurv.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartLoginTest extends BaseTest {

    @Test
    public void Test1_verifyErrorLabelAfterEnteringWrongMobileNumber() {

        String expectedErrorLabel = "Please enter valid Email ID/Mobile number";

        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setMobileNumber("34563467457567");
        loginPage.clickRequestOTP();
        String actualErrorLabel = loginPage.getErrorLabelText();
        Assert.assertEquals(actualErrorLabel,expectedErrorLabel,"Mobile  number not correct error should be thrown");

    }


}
