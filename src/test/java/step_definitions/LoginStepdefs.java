package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepdefs {

    private WebDriver webDriver;
    public LoginStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^open the website alta-dashboard-immersive\\.vercel\\.app$")
    public void openTheWebsiteAltaDashboardImmersiveVercelApp() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("^input email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void inputEmailAndPassword(String email, String pswd) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmailSignIn(email);
        loginPage.setPasswordSignIn(pswd);
    }

    @Then("^click button login$")
    public void clickButtonLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setBtnLogin();
        Thread.sleep(5000);
    }

    @And("^already on Dashboard page$")
    public void alreadyOnDashboardPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyDashboardPage());
    }
}
