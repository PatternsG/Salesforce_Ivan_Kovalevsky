package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeadInformationPage extends BasePage {

    private final By LEADS_ITEM_LOCATOR = By.xpath("//h2[text()='New Lead']");
    private final By SALUTATION_LOCATOR = By.cssSelector("#combobox-button-145");
    private final By FIRST_NAME_LOCATOR = By.cssSelector("#input-233");
    private final By LAST_NAME_LOCATOR = By.cssSelector("#input-234");
    private final By COMPANY_LOCATOR = By.cssSelector("#input-240");
    private final By PHONE_LOCATOR = By.cssSelector("#input-236");
    private final By EMAIL_LOCATOR = By.cssSelector("#input-242");
    private final By SAVE_BUTTON_LOCATOR = By.xpath("//button[@name='SaveEdit']");


    public LeadInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(LEADS_ITEM_LOCATOR);
    }

    public LeadInformationPage setFirstNameInput() {
        driver.findElement(FIRST_NAME_LOCATOR).sendKeys("Gosha");
        return new LeadInformationPage(driver);
    }

    public LeadInformationPage setLastNameInput() {
        driver.findElement(LAST_NAME_LOCATOR).sendKeys("Ivanov");
        return new LeadInformationPage(driver);
    }

    public LeadInformationPage setCompanyInput() {
        driver.findElement(COMPANY_LOCATOR).sendKeys("TMS");
        return new LeadInformationPage(driver);
    }

    public LeadInformationPage setPhoneInput() {
        driver.findElement(PHONE_LOCATOR).sendKeys("+375333333333");
        return new LeadInformationPage(driver);
    }

    public LeadInformationPage setEmailInput() {
        driver.findElement(EMAIL_LOCATOR).sendKeys("gosha@gmail.com");
        return new LeadInformationPage(driver);
    }

    public void waitForElementClickable() {
        wait.until(ExpectedConditions.elementToBeClickable(SAVE_BUTTON_LOCATOR));
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON_LOCATOR).click();
    }
}
