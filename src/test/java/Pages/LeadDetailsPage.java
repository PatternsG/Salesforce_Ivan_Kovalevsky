package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends BasePage {

    private final static By LEAD_OWNER_LOCATOR =
            By.xpath("//span[@class='test-id__field-label'][text()='Name']" +
                    "//parent::div//following-sibling::div//lightning-formatted-name");

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(LEAD_OWNER_LOCATOR);
    }
}
