package step_definitions.ListClass_;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListClass.ListClassPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static step_definitions.Hooks.webDriver;

public class EditClass {
    @When("^admin click icon edit class on full name \"([^\"]*)\"$")
    public void adminClickIconEditClassOnFullName(String editClass) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+editClass+"']/parent::tr/child::td[5]/child::button"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("^appear modal form Edit class$")
    public void appearModalFormEditClass() throws InterruptedException {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        Assert.assertTrue(listClassPage.verifyModalPageEdit());
        Thread.sleep(1000);
    }

    @And("^admin click exit button$")
    public void adminClickExitButton()  throws InterruptedException {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        listClassPage.setBtnExitEdit();
        Thread.sleep(5000);
    }
}
