package org.projectA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name=\"user-name\"]")
    public WebElement $userName;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement $password;

    @FindBy(xpath = "//input[@name=\"login-button\"]")
    public WebElement $logInBtn;

    public void typeUserName(String userName) {
        this.$userName.clear();
        this.$userName.sendKeys(userName);
    }

    public void typePassword(String password) {
        this.$password.clear();
        this.$password.sendKeys(password);
    }

    public void clickOnLogin() {
        this.$logInBtn.click();
    }
}
