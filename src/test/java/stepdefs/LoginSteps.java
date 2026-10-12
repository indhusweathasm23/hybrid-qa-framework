package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage = new LoginPage(DriverFactory.getDriver());
        loginPage.open();
    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("products page should be displayed")
    public void products_page_should_be_displayed() {
        Assert.assertTrue(loginPage.isProductsPageDisplayed(),
                "Products page was not displayed");
    }

    @Then("error message should contain {string}")
    public void error_message_should_contain(String expectedText) {
        String actual = loginPage.getErrorMessage();
        Assert.assertTrue(actual.contains(expectedText),
                "Expected text '" + expectedText + "' but got: " + actual);
    }
}