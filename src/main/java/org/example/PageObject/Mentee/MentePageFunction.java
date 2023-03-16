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

}
