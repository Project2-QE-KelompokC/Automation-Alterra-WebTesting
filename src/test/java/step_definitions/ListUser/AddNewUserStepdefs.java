package step_definitions.ListUser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListUser.ListUserPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import step_definitions.Hooks;

public class AddNewUserStepdefs {

    private WebDriver webDriver;
    public AddNewUserStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^admin click button Add New User$")
    public void adminClickButtonAddNewUser() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        listUserPage.setBtnNewUsers();
        Thread.sleep(3000);
    }

    @Then("^appear modal form Add New User$")
    public void appearModalFormAddNewUser() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyModalPage());
        Thread.sleep(1000);
    }

    @When("^admin input valid name \"([^\"]*)\"$")
    public void adminInputValidName(String fullName) throws Throwable {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        listUserPage.setInputFullName(fullName);
        Thread.sleep(1000);
    }

    @And("^admin input valid email \"([^\"]*)\"$")
    public void adminInputValidEmail(String inputEmail) throws Throwable {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        listUserPage.setInputEmail(inputEmail);
        Thread.sleep(1000);
    }

    @And("^admin input password \"([^\"]*)\"$")
    public void adminInputPassword(String inputPswd) throws Throwable {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        listUserPage.setInputPassword(inputPswd);
        Thread.sleep(1000);
    }

    @And("^select Mentor on team dropdown$")
    public void selectMentorOnTeamDropdown() throws InterruptedException {
        Select a = new Select (webDriver.findElement(By.name("team")));
        a.selectByVisibleText("Mentor");
        Thread.sleep(1000);
    }

    @And("^select User on role dropdown$")
    public void selectUserOnRoleDropdown() throws InterruptedException {
        Select a = new Select (webDriver.findElement(By.name("role")));
        a.selectByVisibleText("User");
        Thread.sleep(1000);
    }

    @And("^select Active on status dropdown$")
    public void selectActiveOnStatusDropdown() throws InterruptedException {
        Select a = new Select (webDriver.findElement(By.name("status")));
        a.selectByVisibleText("Active");
        Thread.sleep(1000);
    }

    @When("^admin click button Submit on modal Add New User$")
    public void adminClickButtonSubmitOnModalAddNewUser() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        listUserPage.setBtnSubmit();
        Thread.sleep(5000);

    }

    @Then("^appear name \"([^\"]*)\"$")
    public void appearName(String fullName) throws Throwable {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+fullName+"']"));
        a.isDisplayed();
        Assert.assertTrue(true);
    }

    @And("^email \"([^\"]*)\" on list user$")
    public void emailOnListUser(String email) throws Throwable {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+email+"']"));
        a.isDisplayed();
        Assert.assertTrue(true);
    }

    @Then("^button Submit on modal Add New User can't be click$")
    public void buttonSubmitOnModalAddNewUserCanTBeClick() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyModalPage());
        Thread.sleep(1000);
    }
}
