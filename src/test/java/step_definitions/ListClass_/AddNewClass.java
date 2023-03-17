package step_definitions.ListClass_;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListClass.ListClassPage;
import org.junit.Assert;

import static step_definitions.Hooks.webDriver;

public class AddNewClass {
    @When("^user click add new class button$")
    public void userClickAddNewClassButton() {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        listClassPage.setBtnAddNewClass();
    }

    @Then("^appear modal from add new class$")
    public void appearModalFromAddNewClass() throws InterruptedException {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        Assert.assertTrue(listClassPage.verifyModalPageAdd());
        Thread.sleep(1000);
    }

    @And("^user click button cancel$")
    public void userClickButtonCancel() throws InterruptedException {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        listClassPage.setBtnCancel();
        Thread.sleep(5000);
    }
}
