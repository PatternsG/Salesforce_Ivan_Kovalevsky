package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LitghtningFormattedText extends BaseElement {

    private final static String TEXT_LOCATOR =
            "//span[@class='test-id__field-label'][text()='%s']" +
                    "//parent::div//following-sibling::div//*[@slot='outputField']";

    public LitghtningFormattedText(WebDriver driver, String label) {
        super(driver, label);
    }

    public String getValue() {
        WebElement getElement = driver.findElement(
                By.xpath(String.format(TEXT_LOCATOR, label)));
        scrollIntoView(getElement);
        return getElement.getText();
    }

}
