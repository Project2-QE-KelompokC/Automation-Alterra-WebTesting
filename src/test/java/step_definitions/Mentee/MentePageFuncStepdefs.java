package step_definitions.Mentee;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Mentee.MentePageFunction;
import org.example.PageObject.Mentee.MenteePageValidation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
        menteePageValidation.setEmailSignIn("user@gmail.com");
        menteePageValidation.setPasswordSignIn("User");
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
        Select drpCountry = new Select(webDriver.findElement(By.name("Class")));
        drpCountry.selectByVisibleText(arg0);
        Thread.sleep(3000);
    }

    @Then("^user appear data with class FE 3$")
    public void userAppearDataWithClass() throws Throwable {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyClass());
        Thread.sleep(3000);
    }

    @When("^user filter by education choose \"([^\"]*)\"$")
    public void userFilterByEducationChoose(String arg0) throws Throwable {
        Select drpCountry = new Select(webDriver.findElement(By.name("Education")));
        drpCountry.selectByVisibleText(arg0);
        Thread.sleep(3000);
    }

    @Then("^user appear data with filter education IT$")
    public void userAppearDataWithFilterEducation() throws Throwable {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyEducation());
        Thread.sleep(3000);

    }

    @When("^user filter by status choose \"([^\"]*)\"$")
    public void userFilterByStatusChoose(String a) throws Throwable {
        Select drpCountry = new Select(webDriver.findElement(By.name("Status")));
        drpCountry.selectByVisibleText(a);
        Thread.sleep(3000);
    }

    @Then("^user appear data with filter status Join Class$")
    public void userAppearDataWithFilterStatus() throws Throwable {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyStatus());
        Thread.sleep(3000);
    }

    @When("^user click delete button in data name boni$")
    public void userClickDeleteButtonInDataNameBoni() {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        mentePageFunction.setBtnDelete();
    }

    @And("^user click yes pop up confirmation delete$")
    public void userClickYesPopUpConfirmationDelete() {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        mentePageFunction.setBtnYes();
    }

    @Then("^user succesfully delete mentee name boni$")
    public void userSuccesfullyDeleteMenteeNameBoni() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyDataMenteeInvalid());
        Thread.sleep(3000);
    }

    @And("^user fill data add new mentee with valid data$")
    public void userFillDataAddNewMenteeWithValidData() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        mentePageFunction.setFieldNama("Harun");
        mentePageFunction.setFieldAddress("Jl bunga no 98");
        mentePageFunction.setFieldAddressHome("Jl bunga no 98");
        mentePageFunction.setFieldEmail("dar@gmail.com");
        mentePageFunction.setRadioGender();
        mentePageFunction.setFieldEmergencyName("Nanung");
        mentePageFunction.setFieldEmergencyPhone("081292929");
        mentePageFunction.setRadioEducation();
        mentePageFunction.setFieldEducationMajor("Teknik");
        mentePageFunction.setFieldEducationGraudate("2022-09-08");
        Thread.sleep(3000);
    }

    @And("^user click button save$")
    public void userClickButtonSave() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        mentePageFunction.setBtnSave();
        Thread.sleep(3000);
    }

    @Then("^user succesfully add new mente go to page mentee list$")
    public void userSuccesfullyAddNewMenteGoToPageMenteeList() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyGoToPage());
        Thread.sleep(3000);
    }

    @And("^user fill data add new mentee with invalid data$")
    public void userFillDataAddNewMenteeWithInvalidData() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        mentePageFunction.setFieldNama("");
        mentePageFunction.setFieldAddress("");
        mentePageFunction.setFieldAddressHome("");
        mentePageFunction.setFieldEmail("dar@gmail.com");
        mentePageFunction.setRadioGender();
        mentePageFunction.setFieldEmergencyName("Nanung");
        mentePageFunction.setFieldEmergencyPhone("081292929");
        mentePageFunction.setRadioEducation();
        mentePageFunction.setFieldEducationMajor("Teknik");
        mentePageFunction.setFieldEducationGraudate("2022-09-08");
        Thread.sleep(3000);
    }

    @Then("^user cant be click save data invalid$")
    public void userCantBeClickSaveDataInvalid() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyCantBeClick());
        Thread.sleep(1000);
    }

    @And("^user fill edit mentee with valid data$")
    public void userFillEditMenteeWithValidData() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='full_name']"));
        a.clear();
        Thread.sleep(1000);
        a.sendKeys("wati");
        Thread.sleep(1000);
    }

    @And("^user click submit$")
    public void userClickSubmit() {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        mentePageFunction.setBtnSubmit();
    }

    @Then("^user appear edited data mentee in mentee page$")
    public void userAppearEditedDataMenteeInMenteePage() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyEditData());
        Thread.sleep(3000);
    }

    @And("^user fill edit mentee with invalid data$")
    public void userFillEditMenteeWithInvalidData() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='full_name']"));
        a.clear();
        Thread.sleep(1000);
    }

    @Then("^user cant be click submit with invalid data$")
    public void userCantBeClickSubmitWithInvalidData() throws InterruptedException {
        MentePageFunction mentePageFunction = new MentePageFunction(webDriver);
        Assert.assertTrue(mentePageFunction.setVerifyCantBeClick2());
        Thread.sleep(3000);

    }
}
