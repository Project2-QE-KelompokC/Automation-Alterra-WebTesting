package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h4[@class='text-italic text-dark-alta text-4xl italic font-light mx-auto mt-2']")
    private WebElement loginPage;
    public boolean verifyLoginPage(){
        loginPage.isDisplayed();
        return true;
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

    @FindBy(xpath = "//p[.='Class']")
    private WebElement dashboardPage;
    public boolean verifyDashboardPage(){
        dashboardPage.isDisplayed();
        return true;
    }


}