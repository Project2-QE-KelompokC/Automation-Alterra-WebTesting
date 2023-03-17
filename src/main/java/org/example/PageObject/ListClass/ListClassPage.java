package org.example.PageObject.ListClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListClassPage {
    public static WebDriver driver;

    public ListClassPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//p[.='Class']")
    private WebElement btnClass;
    public void setBtnClass(){
        btnClass.click();
    }

    @FindBy(xpath = "//h3[@class='text-3xl font-bold text-primary ']")
    private WebElement classListPage;
    public boolean verifyClassListPage(){
        classListPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//p[.='Class']")
    private WebElement listClass;
    public void verifyClass() {
        listClass.click();
    }

    @FindBy(xpath = "//label[@class='btn btn-ghost bg-white hover:text-orange-alta hover:bg-white text-dark-alta']")
    private WebElement btnAddNewClass;
    public void setBtnAddNewClass(){
        btnAddNewClass.click();
    }

    @FindBy(xpath = "//div[@class='flex justify-center text-dark-alta font-semibold text-xl mb-5']")
    private WebElement modalPageAdd;
    public boolean verifyModalPageAdd(){
        modalPageAdd.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//label[@class='modal-action btn-sm w-20 my-auto btn  bg-white border border-orange-alta hover:bg-orange-alta hover:text-white hover:border-none text-orange-alta ']")
    private WebElement btnCancel;
    public void setBtnCancel(){
        btnCancel.click();
    }

    @FindBy(xpath = "//label[@class='btn btn-ghost bg-white hover:text-orange-alta hover:bg-white text-dark-alta']")
    private WebElement btnEditClass;
    public void setBtnEditClass(){
        btnAddNewClass.click();
    }

    @FindBy(xpath = "//h3[@class='font-bold text-primary text-xl mb-3']")
    private WebElement modalPageEdit;
    public boolean verifyModalPageEdit(){
        modalPageEdit.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//label[@class='btn btn-ghost btn-sm btn-circle absolute right-2 top-2']")
    private WebElement btnExitEdit;
    public void setBtnExitEdit(){
        btnExitEdit.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement modalPageDelete;
    public boolean verifyModalPageDelete(){
        modalPageDelete.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYesDel;
    public void setBtnYesDel (){
        btnYesDel.click();
    }
}
