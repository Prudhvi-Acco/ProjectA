package org.projectA.testCases;

import org.projectA.pageObjects.LoginPage;
import org.projectA.utilities.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validlogin extends Base {

    @Test
    public void logInTest() {

        webDriver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(webDriver);

        Assert.assertTrue(loginPage.$userName.isDisplayed(), "UserName Field is not DIsplayed");
        Assert.assertTrue(loginPage.$password.isDisplayed(), "Password Field is not DIsplayed");
        Assert.assertTrue(loginPage.$logInBtn.isDisplayed(), "Login button is not DIsplayed");
        loginPage.typeUserName("standard_user");
        loginPage.typePassword("secret_sauce");
        loginPage.clickOnLogin();

        Assert.assertEquals(webDriver.getTitle(), "Swag Labs");
    }
}
