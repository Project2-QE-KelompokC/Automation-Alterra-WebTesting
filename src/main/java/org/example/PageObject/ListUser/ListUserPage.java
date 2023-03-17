package org.example.PageObject.ListUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListUserPage {
    public static WebDriver driver;
    public ListUserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//p[.='Users']")
    private WebElement btnUsers;
    public void setBtnUsers(){
        btnUsers.click();
    }

    @FindBy(xpath = "//h3[@class='text-3xl font-bold text-primary ']")
    private WebElement userListPage;
    public boolean verifyUserListPage(){
        userListPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//p[.='Users']")
    private WebElement listUser;
    public boolean verifyListUser(){
        listUser.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[contains(.,'Add New User')]")
    private WebElement btnAddNewUser;
    public void setBtnNewUsers(){
        btnAddNewUser.click();
    }

    @FindBy(xpath = "//input[@id='full_name']")
    private WebElement inputFullName;
    public void setInputFullName(String fullName){
        inputFullName.sendKeys(fullName);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;
    public void setInputEmail(String newEmail){
        inputEmail.sendKeys(newEmail);
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;
    public void setInputPassword(String inputPswd){
        inputPassword.sendKeys(inputPswd);
    }

    @FindBy(xpath = "//h3[@class='font-bold text-primary text-xl mb-3']")
    private WebElement modalPage;
    public boolean verifyModalPage(){
        modalPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//select[@id='team']")
    private WebElement teamDropdown;
    public void setTeamDropdown(){
        teamDropdown.click();
    }

    @FindBy(xpath = "//label[@class='btn btn-accent']")
    private WebElement btnSubmit;
    public void setBtnSubmit(){
        btnSubmit.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement deleteModal;
    public boolean verifyDeleteModal(){
        deleteModal.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYesDelete;
    public void setBtnYesDelete (){
        btnYesDelete.click();
    }

    @FindBy(xpath = "//h3[@class='font-bold text-primary text-xl mb-3']")
    private WebElement updateModal;
    public boolean verifyUpdateModal(){
        updateModal.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[.='Submit']")
    private WebElement btnSubmitUpdate;
    public void setBtnSubmitUpdate(){
        btnSubmitUpdate.click();
    }

}
