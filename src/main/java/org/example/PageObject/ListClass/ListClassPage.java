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
}
