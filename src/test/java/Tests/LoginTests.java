package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(groups = "Smoke")
    public void positiveLoginTest() {
        loginPage.setUserNameInput(USER_NAME)
                .setPasswordInput(PASSWORD)
                .clickLoginButton()
                .waitForPageLoaded();
        Assert.assertTrue(homePage.isUserIconDisplayed());
    }
}
