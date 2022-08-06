package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class EntityBasePage extends BasePage {

    private final static By NEW_BUTTON = By.xpath("div[title = 'New']");
    private final static By ENTITY_LINK_LOCATOR = By.cssSelector("table[");

    public EntityBasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(NEW_BUTTON);
    }

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void openEntityByName(String entityName) {
        List<WebElement> allLinks = getAllEntitiesLinks();
        allLinks.stream().filter(webElement -> webElement.getText().equals(entityName))
                .findFirst()
                .get()
                .click();
    }

    private List<WebElement> getAllEntitiesLinks() {
        return driver.findElements(ENTITY_LINK_LOCATOR);
    }
}
