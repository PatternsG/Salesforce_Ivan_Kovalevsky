package Pages;

import org.openqa.selenium.WebDriver;

public abstract class AccountDetailsPage extends BasePage {

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }
}
