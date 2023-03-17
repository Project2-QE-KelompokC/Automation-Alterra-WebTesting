package step_definitions.Mentee;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.LoginPage;
import org.example.PageObject.Mentee.MenteePageValidation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import step_definitions.Hooks;

public class MenteePageValidationStepdefs {

    private WebDriver webDriver;
    public MenteePageValidationStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("^user already login and on page Mentee list$")
    public void userAlreadyLoginAndOnPageMenteeList() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setEmailSignIn("user@gmail.com");
        menteePageValidation.setPasswordSignIn("User");
        menteePageValidation.setBtnLogin();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        menteePageValidation.setMenteMenu();
        Thread.sleep(3000);
    }

    @When("^user click field search nama for fill$")
    public void userClickFieldSearchNamaForFill() {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setClickSearch();

    }

    @Then("^user should be fill nama \"([^\"]*)\"$")
    public void userShouldBeFillNama(String arg0) throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setNameSearch(arg0);
        Thread.sleep(3000);
    }

    @When("^user click dropdown filter class$")
    public void userClickDropdownFilterClass() {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setClickFilterClass();
    }

    @Then("^user should be select class choose \"([^\"]*)\"$")
    public void userShouldBeSelectClassChoose(String arg0) throws Throwable {
        Select drpCountry = new Select(webDriver.findElement(By.name("Class")));
        drpCountry.selectByVisibleText(arg0);
        Thread.sleep(3000);
    }

    @When("^user click dropdown filter education$")
    public void userClickDropdownFilterEducation() {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setClickFilterEducation();
    }

    @Then("^user should be select filter education choose \"([^\"]*)\"$")
    public void userShouldBeSelectFilterEducationChoose(String arg0) throws Throwable {
        Select drpCountry = new Select(webDriver.findElement(By.name("Education")));
        drpCountry.selectByVisibleText(arg0);
        Thread.sleep(3000);
    }

    @When("^user click dropdown filter status$")
    public void userClickDropdownFilterStatus() {

        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setClickFilterStatus();
    }

    @Then("^user should be select filter status choose \"([^\"]*)\"$")
    public void userShouldBeSelectFilterStatusChoose(String arg0) throws Throwable {
        Select drpCountry = new Select(webDriver.findElement(By.name("Status")));
        drpCountry.selectByVisibleText(arg0);
        Thread.sleep(3000);
    }

    @When("^user click button add new mentee$")
    public void userClickButtonAddNewMentee() {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setBtnAddMentee();

    }

    @Then("^button can be click go to page new mentee$")
    public void buttonCanBeClickGoToPageNewMentee() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        Assert.assertTrue(menteePageValidation.setAddMenteePage());
        Thread.sleep(3000);
    }

    @When("^user click button details$")
    public void userClickButtonDetails() {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setBtnDetails();

    }

    @Then("^button can be click go to details page$")
    public void buttonCanBeClickGoToDetailsPage() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        Assert.assertTrue(menteePageValidation.setVerifyDetailPage());
        Thread.sleep(3000);
    }

    @When("^user click button edit$")
    public void userClickButtonEdit() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setBtnEdit();

    }

    @Then("^button can be click appear pop up page edit$")
    public void buttonCanBeClickAppearPopUpPageEdit() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        Assert.assertTrue(menteePageValidation.setVerifyEditPage());
        Thread.sleep(3000);
    }

    @When("^user click button delete$")
    public void userClickButtonDelete() {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setBtnDelete();
    }

    @Then("^button can be click appear pop up confirmation delete$")
    public void buttonCanBeClickAppearPopUpConfirmationDelete() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        Assert.assertTrue(menteePageValidation.setVerifyPopUpDelete());
        Thread.sleep(3000);
    }
}
