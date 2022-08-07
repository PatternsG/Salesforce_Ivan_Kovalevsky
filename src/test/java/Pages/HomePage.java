package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By USER_ICON_LOCATOR = By.cssSelector(".slds-avatar_profile-image-small");
    private final By LEADS_TAB_LOCATOR = By.xpath("//*[@title='Leads']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(USER_ICON_LOCATOR);
    }

    public void clickLeadsButton() {
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOCATOR).isDisplayed();
    }
}
