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


}
