package org.example.PageObject.Mentee;

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
}
