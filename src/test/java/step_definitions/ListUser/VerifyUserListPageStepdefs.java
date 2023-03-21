package step_definitions.ListUser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListUser.ListUserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class VerifyUserListPageStepdefs {
    private WebDriver webDriver;
    public VerifyUserListPageStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^admin click button User on side bar$")
    public void adminClickButtonUserOnSideBar() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        listUserPage.setBtnUsers();
        Thread.sleep(1000);
    }

    @Then("^appear User List Page$")
    public void appearUserListPage() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyUserListPage());
        Thread.sleep(1000);
    }

    @And("^user registered appear on User List Page$")
    public void userRegisteredAppearOnUserListPage() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyListUser());
        Thread.sleep(1000);
    }
}
