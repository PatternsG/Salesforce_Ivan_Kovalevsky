package Pages.Modal;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseModal extends BasePage {

    private final static By SAVE_BUTTON_LOCATOR = By.cssSelector(".slds-button.slds-button_brand");

    public BaseModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(SAVE_BUTTON_LOCATOR);
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON_LOCATOR).click();
    }
}
