package step_definitions.ListUser;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListUser.ListUserPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class DeleteUserStepdefs {

    private WebDriver webDriver;
    public DeleteUserStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^admin click icon delete user \"(.*)\"$")
    public void adminClickIconDeleteUser(String deleteUser) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+deleteUser+"']/parent::tr/child::td[8]/child::button"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("^appear modal confirmation Delete User$")
    public void appearModalConfirmationDeleteUser() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyModalPage());
        Thread.sleep(1000);
    }


    @When("^admin click button Yes on modal Delete User$")
    public void adminClickButtonYesOnModalDeleteUser() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']"));
        a.click();
        Thread.sleep(1000);
    }

}
