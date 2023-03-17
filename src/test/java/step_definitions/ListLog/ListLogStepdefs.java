package step_definitions.ListLog;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ListLog.ListLog;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;
import org.openqa.selenium.support.ui.Select;

public class ListLogStepdefs {

    private WebDriver webDriver;
    public ListLogStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^user click from title$")
    public void userClickFromTitle() throws InterruptedException {
        ListLog listLog = new ListLog(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(3000);
        listLog.setBtnMeente();
        Thread.sleep(1000);
    }

    @Then("^user can be write$")
    public void userCanBeWrite() {
    }

    @When("^user clik from side mente$")
    public void userClikFromSideMente() throws InterruptedException {
        ListLog listLog = new ListLog(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(3000);
        listLog.setBtnMeente();
        Thread.sleep(1000);
    }

    @Then("^user clik from \\.\\.\\. detail$")
    public void userClikFromDetail() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//tbody[1]/tr[1]//button[@class='text-dark-alta hover:text-orange-alta cursor-pointer']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^user clik add new log$")
    public void userClikAddNewLog() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//label[@class='bg-dark-alta w-30 text-white btn']"));
        a.click();
        Thread.sleep(2000);
    }

    @When("^user click dropdown \"([^\"]*)\"$")
    public void userClickDropdown(String status) throws  InterruptedException {
        Select a = new Select(webDriver.findElement(By.xpath("//select[@class='select select-bordered w-40 bg-white border border-dark-alta h-10 text-dark-alta']")));
        a.selectByVisibleText(status);
        Thread.sleep(3000);
    }

    @Then("^user should be select status choose \"([^\"]*)\"$")
    public void userShouldBeSelectStatusChoose(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @And("^user input \"([^\"]*)\" from text area$")
    public void userInputFromTextArea(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//textarea[@class='textarea textarea-bordered textarea-xs w-full max-w-xs']"));

        a.sendKeys(arg0);
        Thread.sleep(6000);
    }

    @And("^user input \"([^\"]*)\" from text are title$")
    public void userInputFromTextAreTitle(String arg) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@class='input flex flex-start border rounded-md h-12 border-dark-alta']"));
        a.sendKeys(arg);
        Thread.sleep(6000);

    }

    @And("^user klik save$")
    public void userKlikSave() {
    }
}
