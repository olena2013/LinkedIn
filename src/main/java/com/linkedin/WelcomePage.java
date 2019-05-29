package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {
    public WelcomePage(WebDriver driver){ super(driver); }

   @FindBy(css = "#username")
    private WebElement inputEmailField;

    @FindBy(css = "#password")
    private WebElement inputPasswordField;




}
