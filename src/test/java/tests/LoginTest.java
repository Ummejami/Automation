package tests;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.LoginPage;
import utils.DriverManager;

@Epic("Authentication")
@Feature("Login Feature")
public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Valid Login Test")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test login with valid credentials")
    public void validLoginTest() {

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"));
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
