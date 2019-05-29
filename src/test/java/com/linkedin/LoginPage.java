package com.linkedin;

import org.junit.Test;

public class LoginPage extends BaseTest {
    protected HomePage homePage;
    protected WelcomePage welcomePage;
    protected SecurityCheckPage securityCheckPage;


    @Test
    public void testLogin() {
        homePage = new HomePage(driver);
        welcomePage = homePage.clickLoginButton();
        welcomePage.inputEmail(user.getEmail());
        welcomePage.inputPassword(user.getPassword());
        welcomePage.clickSubmitButton();
    }
}
