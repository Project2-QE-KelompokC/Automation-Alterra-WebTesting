package org.example.PageObject.Mentee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenteePageValidation {

    public static WebDriver driver;
    public MenteePageValidation(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//input[@class='input input-md block w-[400px] px-4  py-2 mt-2 text-dark-alta bg-white border rounded-md focus:border-dark-alta focus:ring-dark-alta outline-dark-alta outline outline-1 focus:outline-none focus:ring focus:ring-opacity-40']")
    private WebElement emailSignIn;
    public void setEmailSignIn(String email){
        emailSignIn.sendKeys(email);
    }
    @FindBy(xpath = "//input[@class='input input-md w-[400px] block mx-auto px-4 py-2 mt-2 text-dark-alta bg-white border rounded-md focus:border-dark-alta focus:ring-dark-alta outline-dark-alta outline outline-1 focus:outline-none focus:ring focus:ring-opacity-40']")
    private WebElement passwordSignIn;
    public void setPasswordSignIn (String pswd){
        passwordSignIn.sendKeys(pswd);
    }

    @FindBy(xpath = "//button[@class='btn btn-wide mx-auto px-4 py-2 tracking-wide text-white transition-colors duration-200 transform bg-orange-alta rounded-md hover:bg-orange-700 focus:outline-none focus:bg-dark-alta']")
    private WebElement btnLogin;
    public void setBtnLogin(){
        btnLogin.click();
    }

    @FindBy(xpath = "//p[contains(.,'Mentee')]")
    private WebElement menteMenu;
    public void setMenteMenu(){
        menteMenu.click();
    }

    @FindBy(xpath = "//input[@class='input input-bordered']")
    private WebElement clickSearch;
    public void setClickSearch (){
        clickSearch.click();
    }

    @FindBy(xpath = "//input[@class='input input-bordered']")
    private WebElement nameSearch;
    public void setNameSearch (String string){
        nameSearch.sendKeys(string);
    }

    @FindBy(xpath = "//option[.='Filter Class']")
    private WebElement clickFilterClass;
    public void setClickFilterClass (){
        clickFilterClass.click();
    }

    @FindBy(xpath = "//select[@name='Education']")
    private WebElement clickFilterEducation;
    public void setClickFilterEducation (){
        clickFilterEducation.click();
    }

    @FindBy(xpath = "//select[@name='Education']")
    private WebElement clickFilterStatus;
    public void setClickFilterStatus (){
        clickFilterStatus.click();
    }

    @FindBy(xpath = "//a[contains(.,'Add New Mentee')]")
    private WebElement btnAddMentee;
    public void setBtnAddMentee (){
        btnAddMentee.click();
    }

    @FindBy(xpath = "//h3[@class='text-3xl font-bold text-primary ']")
    private WebElement addMenteePage;
    public boolean setAddMenteePage(){
        addMenteePage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//tbody[1]/tr[1]//button[@class='text-dark-alta hover:text-orange-alta cursor-pointer']")
    private WebElement btnDetails;
    public void setBtnDetails (){
        btnDetails.click();
    }

    @FindBy(xpath = "//h3[@class='text-3xl font-bold text-primary ']")
    private WebElement verifyDetailsPage;
    public boolean setVerifyDetailPage(){
        verifyDetailsPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//tbody[1]/tr[1]/td[7]/button[@class='text-orange-alta hover:text-dark-alta']")
    private WebElement btnEdit;
    public void setBtnEdit (){
        btnEdit.click();
    }

    @FindBy(xpath = "//h3[@class='font-bold text-primary text-xl mb-3']")
    private WebElement verifyEditPage;
    public boolean setVerifyEditPage(){
        verifyEditPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//tbody[1]/tr[1]/td[8]/button[@class='text-orange-alta hover:text-dark-alta']")
    private WebElement btnDelete;
    public void setBtnDelete (){
        btnDelete.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement verifyPopUpDelete;
    public boolean setVerifyPopUpDelete(){
        verifyPopUpDelete.isDisplayed();
        return true;
    }
}
