package step_definitions.ListClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListClass.ListClassPage;
import org.example.PageObject.ListUser.ListUserPage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static step_definitions.Hooks.webDriver;

public class VerifyClassListPageStepDefs {
    @When("^admin click button class on side bar$")
    public void adminClickButtonClassOnSideBar() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,150)", "");
        Thread.sleep(1000);
        ListClassPage listclassPage = new ListClassPage(webDriver);
        listclassPage.setBtnClass();
        Thread.sleep(2000);
    }

    @Then("^class list page will appear$")
    public void classListPageWillAppear() {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        Assert.assertTrue(listClassPage.verifyClassListPage());
    }

    @And("^user registered appear on class list page$")
    public void userRegisteredAppearOnClassListPage() {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        Assert.assertTrue(listClassPage.verifyClassListPage());
    }
}
