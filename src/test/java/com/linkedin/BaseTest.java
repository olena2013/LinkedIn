package com.linkedin;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    protected WelcomePage welcomePage;
    protected User user;

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Otunyk/IdeaProjects/chromedriver.exe");

       driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        //driver.manage().window().maximize();
        welcomePage = new WelcomePage(driver);
        user = new User();




    }

//    @After
//    public void close() {
//        driver.quit();
//    }
}

