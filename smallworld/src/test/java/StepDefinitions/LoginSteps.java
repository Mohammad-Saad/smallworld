package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.PropertiesReader;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;
    LoginPage login = null;

    public LoginSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
        this.login = new LoginPage(driver, wait);
    }

    @Given("^The user is on SauceDemopage$")
    public void theUserIsOnSauceDemopage() {

    }

    @When("^User Enters valid \"([^\"]*)\"$")
    public void userEntersValid(String arg0) throws Throwable {
        login.fillEmailData(arg0);
    }

    @And("^User Enter Valid \"([^\"]*)\"$")
    public void userEnterValid(String arg0) throws Throwable {
        login.fillPasswordData(arg0);
    }

    @Then("^User should be able to login successfully$")
    public void userShouldBeAbleToLoginSuccessfully() {
        login.clickSignInButton();
    }
}