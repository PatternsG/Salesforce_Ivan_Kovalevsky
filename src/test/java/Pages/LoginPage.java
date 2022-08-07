package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final static String URL = "https://tmsqa1912.my.salesforce.com/";
    private final static By userNameInput = By.cssSelector("#username");
    private final static By passwordInput = By.cssSelector("#password");
    private final static By loginButton = By.cssSelector("#Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(userNameInput);
    }

    public void initialization(String userName, String password) {
        setUserNameInput(userName);
        setPasswordInput(password);
        clickLoginButton();
    }

    public LoginPage setUserNameInput(String userName) {
        driver.findElement(userNameInput).sendKeys(userName);
        return this;
    }

    public LoginPage setPasswordInput(String userName) {
        driver.findElement(passwordInput).sendKeys(userName);
        return this;
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
