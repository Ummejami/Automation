package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By title = By.className("title");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");
    private By cartIcon = By.className("shopping_cart_link");

    // Actions

    public String getPageTitle() {
        return driver.findElement(title).getText();
    }

    public boolean isCartIconDisplayed() {
        return driver.findElement(cartIcon).isDisplayed();
    }

    public void clickMenu() {
        driver.findElement(menuButton).click();
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }

    public void logout() {
        clickMenu();
        clickLogout();
    }
}
