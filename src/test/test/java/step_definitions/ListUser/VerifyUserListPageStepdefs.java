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
    public void adminClickButtonUserOnSideBar() {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        listUserPage.setBtnUsers();
    }

    @Then("^appear User List Page$")
    public void appearUserListPage() {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyUserListPage());
    }

    @And("^user registered appear on User List Page$")
    public void userRegisteredAppearOnUserListPage() {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyListUser());
    }
}
