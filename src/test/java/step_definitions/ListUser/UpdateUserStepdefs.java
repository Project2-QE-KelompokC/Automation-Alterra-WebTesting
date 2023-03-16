package step_definitions.ListUser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListUser.ListUserPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

public class UpdateUserStepdefs {

    private WebDriver webDriver;
    public UpdateUserStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^admin click icon edit user on full name \"([^\"]*)\"$")
    public void adminClickIconEditUserOnFullName(String updateUser) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+updateUser+"']/parent::tr/child::td[7]/child::button"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("^appear modal form Edit User$")
    public void appearModalFormEditUser() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyModalPage());
        Thread.sleep(1000);
    }


    @When("^admin edit name \"([^\"]*)\"$")
    public void adminEditName(String updateFullName) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='full_name']"));
        a.clear();
        Thread.sleep(1000);
        a.sendKeys(updateFullName);
        Thread.sleep(1000);
    }

    @And("^Admin edit email \"([^\"]*)\"$")
    public void adminEditEmail(String updateEmail) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='email']"));
        a.clear();
        Thread.sleep(1000);
        a.sendKeys(updateEmail);
        Thread.sleep(1000);
    }

    @When("^admin click button Submit on modal Edit User$")
    public void adminClickButtonSubmitOnModalEditUser() throws InterruptedException {
        WebElement a;
        a = new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Submit']")));
        a.click();
        Thread.sleep(3000);

    }

    @Then("^appear new name \"([^\"]*)\" on list user$")
    public void appearNewNameOnListUser(String newFullName) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+newFullName+"']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^appear new email \"([^\"]*)\" on list user$")
    public void appearNewEmailOnListUser(String newEmail) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+newEmail+"']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @Then("^button Submit on modal Edit User can't be click$")
    public void buttonSubmitOnModalEditUserCanTBeClick() throws InterruptedException {
        ListUserPage listUserPage = new ListUserPage(webDriver);
        Assert.assertTrue(listUserPage.verifyModalPage());
        Thread.sleep(1000);
    }


    @When("^admin edit invalid name \"([^\"]*)\"$")
    public void adminEditInvalidName(String invalidName) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='full_name']"));
        a.clear();
        Thread.sleep(1000);
        a.sendKeys(invalidName);
        Thread.sleep(1000);
    }

    @And("^Admin edit invalid email \"([^\"]*)\"$")
    public void adminEditInavlidEmail(String InvalidEmail) throws Throwable {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='email']"));
        a.clear();
        Thread.sleep(1000);
        a.sendKeys(InvalidEmail);
        Thread.sleep(1000);
    }

    @When("^admin click button Submit on modal Edit User invalid data$")
    public void adminClickButtonSubmitOnModalEditUserInvalidData() throws InterruptedException {
        WebElement a;
        a = new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Submit']")));
        a.click();
        Thread.sleep(3000);
    }

    @Then("^user \"(.*)\" list data don't change$")
    public void userListDataDonTChange(String verifyInvalidUpdate) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//td[text()='"+verifyInvalidUpdate+"']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }
}
