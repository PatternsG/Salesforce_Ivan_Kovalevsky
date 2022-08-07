package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsPage extends BasePage {

    private final By ICON_LOCATOR = By.cssSelector("div[title = New]");
    private final By NEW_BUTTON_LOCATOR = By.cssSelector("[title = New]");

    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);
    }

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON_LOCATOR).click();
    }

}
