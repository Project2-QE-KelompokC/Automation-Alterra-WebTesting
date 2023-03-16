package step_definitions.Mentee;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Mentee.MentePageFunction;
import org.example.PageObject.Mentee.MenteePageValidation;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MentePageFuncStepdefs {

    private WebDriver webDriver;
    public MentePageFuncStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^user already login$")
    public void userAlreadyLogin() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setEmailSignIn("Admin@gmail.com");
        menteePageValidation.setPasswordSignIn("qwerty");
        menteePageValidation.setBtnLogin();
        Thread.sleep(5000);
    }

    @When("^user click main menu mentee$")
    public void userClickMainMenuMentee() throws InterruptedException {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        menteePageValidation.setMenteMenu();
        Thread.sleep(3000);
    }

    @Then("^user see data mente list$")
    public void userSeeDataMenteList() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyDataMentee());
        Thread.sleep(3000);
    }

    @When("^user filter nama \"([^\"]*)\" with valid data$")
    public void userFilterNamaWithValidData(String arg0) throws Throwable {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setNameSearch(arg0);
        Thread.sleep(3000);
    }

    @Then("^user appear data nama sarah$")
    public void userAppearDataNamaSarah() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyDataMentee());
        Thread.sleep(3000);
    }

    @When("^user filter nama \"([^\"]*)\"  with invalid data$")
    public void userFilterNamaWithInvalidData(String arg0) throws Throwable {
        MenteePageValidation menteePageValidation = new MenteePageValidation(webDriver);
        menteePageValidation.setNameSearch(arg0);
        Thread.sleep(3000);
    }

    @Then("^data mentee list nama not appear$")
    public void dataMenteeListNamaNotAppear() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyDataMenteeInvalid());
        Thread.sleep(3000);
    }

    @When("^user filter by class choose \"([^\"]*)\"$")
    public void userFilterByClassChoose(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user appear data with class \"([^\"]*)\"$")
    public void userAppearDataWithClass(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user filter by education choose \"([^\"]*)\"$")
    public void userFilterByEducationChoose(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user appear data with filter education \"([^\"]*)\"$")
    public void userAppearDataWithFilterEducation(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user filter by status choose \"([^\"]*)\"$")
    public void userFilterByStatusChoose(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user appear data with filter status \"([^\"]*)\"$")
    public void userAppearDataWithFilterStatus(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
