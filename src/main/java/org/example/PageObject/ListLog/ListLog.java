package org.example.PageObject.ListLog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListLog {


    public static WebDriver driver;
    public ListLog(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath ="//p[contains(.,'Mentee')]")
    private WebElement btnMeente;
    public void  setBtnMeente(){
        btnMeente.click();
    }



}
