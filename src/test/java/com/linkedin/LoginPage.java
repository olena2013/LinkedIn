package com.linkedin;

import org.junit.Test;

public class LoginPage extends BaseTest {
    protected HomePage homePage;
    protected WelcomePage welcomePage;


    @Test
    public void testLogin() {
        homePage = new HomePage(driver);
        welcomePage = homePage.clickLoginButton();
    }
}
