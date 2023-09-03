package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public static WebElement userName;

    @FindBy(id = "password")
    public static WebElement passwordField;

    @FindBy(id = "login-button")
    public static WebElement loginBtn;

    public void fillEmailData(String email) {

        WaitUntilElementVisible(userName);
        userName.isEnabled();
        userName.clear();
        userName.sendKeys(email);
    }

    public void fillPasswordData(String password) {

        WaitUntilElementVisible(passwordField);
        passwordField.isEnabled();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {

        WaitUntilElementVisible(loginBtn);
        loginBtn.isEnabled();
        loginBtn.click();
    }
}