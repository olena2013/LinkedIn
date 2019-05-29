package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BasePage {
    public WelcomePage(WebDriver driver){ super(driver); }

   @FindBy(css = "#username")
    private WebElement emailField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = ".btn__primary--large.from__button--floating")
    private WebElement submitButton;

    public void inputEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }
    public void inputPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);

    }
    public void clickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();

    }



}
