package Pages;

import Util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private final WebDriver driver;

    public HomePage(String browser) {
        switch (browser) {
            case "chrome" -> this.driver = DriverManager.createChromeDriver();
            case "firefox" -> this.driver = DriverManager.createFirefoxDriver();
            default -> this.driver = DriverManager.createChromeDriver();
        }
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Phones')]")
    private WebElement categoryPhonesButton;

    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    private WebElement categoryLaptopsButton;

    @FindBy(xpath = "//a[contains(text(),'Monitors')]")
    private WebElement categoryMonitorsButton;

    @FindBy(partialLinkText = "Home")
    private WebElement homeButton;

    @FindBy(partialLinkText = "Contact")
    private WebElement contactButton;

    @FindBy(partialLinkText = "About us")
    private WebElement aboutUsButton;

    @FindBy(partialLinkText = "Cart")
    private WebElement cartButton;

    @FindBy(partialLinkText = "Log in")
    private WebElement logInButton;

    @FindBy(partialLinkText = "Sign up")
    private WebElement signUpButton;

    @FindBy(xpath = "//button[@id='next2']")
    private WebElement nextButton;

    @FindBy(xpath = "//button[@id='prev2']")
    private WebElement previousButton;

    public void phonesButtonClick() {
        categoryPhonesButton.click();
    }

    public void laptopsButtonClick() {
        categoryLaptopsButton.click();
    }

    public void monitorsButtonClick() {
        categoryMonitorsButton.click();
    }

    public void homeButtonClick() {
        homeButton.click();
    }

    public void contactButtonClick() {
        contactButton.click();
    }

    public void aboutUsButtonClick() {
        aboutUsButton.click();
    }

    public void cartButtonClick() {
        cartButton.click();
    }

    public void logInButtonClick() {
        logInButton.click();
    }

    public void signUpButtonClick() {
        signUpButton.click();
    }

    public void nextButtonClick() {
        nextButton.click();
    }

    public void previousButtonClick() {
        previousButton.click();
    }
}
