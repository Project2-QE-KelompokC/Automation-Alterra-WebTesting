package org.example.PageObject.Mentee;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentePageFunction {
    public static WebDriver driver;
    public MentePageFunction(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//td[.='Sarah']")
    private WebElement verifyDataMentee;
    public boolean setVerifyDataMentee(){
        verifyDataMentee.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//th[.='Name']")
    private WebElement verifyDataMenteeInvalid;
    public boolean setVerifyDataMenteeInvalid(){
        verifyDataMenteeInvalid.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//td[.='Immersive Frontend Batch 3']")
    private WebElement verifyClass;
    public boolean setVerifyClass(){
        verifyClass.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//td[.='IT']")
    private WebElement verifyEducation;
    public boolean setVerifyEducation(){
        verifyEducation.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//td[.='Join Class']")
    private WebElement verifyStatus;
    public boolean setVerifyStatus(){
        verifyStatus.isDisplayed();
        return true;
    }
    @FindBy(xpath = "//tr[2]/td[8]/button[@class='text-orange-alta hover:text-dark-alta']")
    private WebElement btnDelete;
    public void setBtnDelete (){
        btnDelete.click();
    }

    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled swal2-default-outline']")
    private WebElement btnYes;
    public void setBtnYes (){
        btnYes.click();
    }
    @FindBy(xpath = "//form[@class='text-md form-control border-2 gap-2 text-dark-alta border-dark-alta rounded-md px-20 py-5 mt-0  h-full']/label[1]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldNama;
    public void setFieldNama (String string){
        fieldNama.sendKeys(string);
    }
    @FindBy(xpath = "//label[2]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldAddress;
    public void setFieldAddress (String string){
        fieldAddress.sendKeys(string);
    }

    @FindBy(xpath = "//label[3]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldAddressHome;
    public void setFieldAddressHome (String string){
        fieldAddressHome.sendKeys(string);
    }

    @FindBy(xpath = "//label[4]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldEmail;
    public void setFieldEmail (String string){
        fieldEmail.sendKeys(string);
    }

    @FindBy(xpath = "//div[@class=' items-center flex gap-3  mr-[500px] ']/input[1]")
    private WebElement radioGender;
    public void setRadioGender (){
        radioGender.click();
    }

    @FindBy(xpath = "//input[@class='radio border border-gray-400 w-5 h-5']")
    private WebElement radioEducation;
    public void setRadioEducation (){
        radioEducation.click();
    }

    @FindBy(xpath = "//label[6]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldTelegram;
    public void setFieldTelegram (String string){
        fieldTelegram.sendKeys(string);
    }

    @FindBy(xpath = "//label[7]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldPhone;
    public void setFieldPhone (String string){
        fieldPhone.sendKeys(string);
    }

    @FindBy(xpath = "//label[8]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldEmergencyName;
    public void setFieldEmergencyName (String string){
        fieldEmergencyName.sendKeys(string);
    }

    @FindBy(xpath = "//label[9]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldEmergencyPhone;
    public void setFieldEmergencyPhone (String string){
        fieldEmergencyPhone.sendKeys(string);
    }

    @FindBy(xpath = "//label[12]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldEducationMajor;
    public void setFieldEducationMajor (String string){
        fieldEducationMajor.sendKeys(string);
    }

    @FindBy(xpath = "//label[13]/input[@class='input input-bordered max-w-2xl w-full bg-white border border-gray-400 h-8']")
    private WebElement fieldEducationGraudate;
    public void setFieldEducationGraudate (String string){
        fieldEducationGraudate.sendKeys(string);
    }

    @FindBy(xpath = "//button[@class='btn btn-sm bg-orange-alta border border-orange-alta text-white  hover:text-orange-alta hover:bg-white hover:border-orange-alta w-20']")
    private WebElement btnSave;
    public void setBtnSave (){
        btnSave.click();
    }

    @FindBy(xpath = "//span[@class='ml-2']")
    private WebElement verifyGoToPageMentee;
    public boolean setVerifyGoToPage(){
        verifyGoToPageMentee.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//span[.='Female']")
    private WebElement verifyCantBeClick;
    public boolean setVerifyCantBeClick(){
        verifyCantBeClick.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[.='Submit']")
    private WebElement btnSubmit;
    public void setBtnSubmit (){
        btnSubmit.click();
    }

    @FindBy(xpath = "//td[.='Wati']")
    private WebElement verifyEditData;
    public boolean setVerifyEditData(){
        verifyEditData.isDisplayed();
        return true;
    }


    @FindBy(xpath = "//input[@id='full_name']")
    private WebElement verifyCantBeClick2;
    public boolean setVerifyCantBeClick2(){
        verifyCantBeClick2.isDisplayed();
        return true;
    }

}
