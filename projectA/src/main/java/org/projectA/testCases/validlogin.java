package org.projectA.testCases;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.projectA.pageObjects.LoginPage;
import org.projectA.utilities.Base;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class validlogin extends Base {

    @Test
    public void JSONCOMPARETEST() throws IOException, JSONException {


        String actualJSon = FileUtils.readFileToString(new File("C:\\Users\\prudh\\IdeaProjects\\ProjectA\\projectA\\src\\main\\java\\org\\projectA\\testData\\payload\\ActualJson.json"));
        String expectedJSon = FileUtils.readFileToString(new File("C:\\Users\\prudh\\IdeaProjects\\ProjectA\\projectA\\src\\main\\java\\org\\projectA\\testData\\payload\\ExpectedJson.json"));

        System.out.println(actualJSon);
        System.out.println("==============");
        System.out.println(expectedJSon);
        System.out.println("==============");

        JSONAssert.assertEquals(expectedJSon, actualJSon, JSONCompareMode.STRICT);
    }
}















/*webDriver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(webDriver);

        Assert.assertTrue(loginPage.$userName.isDisplayed(), "UserName Field is not DIsplayed");
        Assert.assertTrue(loginPage.$password.isDisplayed(), "Password Field is not DIsplayed");
        Assert.assertTrue(loginPage.$logInBtn.isDisplayed(), "Login button is not DIsplayed");
        loginPage.typeUserName("standard_user");
        loginPage.typePassword("secret_sauce");
        loginPage.clickOnLogin();

        Assert.assertEquals(webDriver.getTitle(), "Swag Labs");*/
