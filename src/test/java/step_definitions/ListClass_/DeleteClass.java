package step_definitions.ListClass_;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListClass.ListClassPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static step_definitions.Hooks.webDriver;

public class DeleteClass {
    @When("^admin click icon delete Class \"([^\"]*)\"$")
    public void adminClickIconDeleteClass(String deleteClass) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='" + deleteClass + "']/parent::tr/child::td[6]/child::button"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("^appear modal confirmation Delete Class$")
    public void appearModalConfirmationDeleteClass() throws InterruptedException {
        ListClassPage listClassPage = new ListClassPage(webDriver);
        Assert.assertTrue(listClassPage.verifyModalPageDelete());
        Thread.sleep(1000);
    }

    @And("^admin click button Yes on modal Delete Class$")
    public void adminClickButtonYesOnModalDeleteClass() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']"));
        a.click();
        Thread.sleep(1000);
    }
}
