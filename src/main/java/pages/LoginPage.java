package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName = By.xpath("//input[@name='username' and @id='username']");
    private By password = By.xpath("//input[@name='password' and @id='password']");
    private By loginButton =  By.xpath("//button[@type='submit' and @name='login']");
    private By loginMessage = By.xpath("//p[contains(text(), 'From your account dashboard you can view your')]");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String name, String passwordChar) {
        driver.findElement(userName).sendKeys(name);
        driver.findElement(password).sendKeys(passwordChar);
        driver.findElement(loginButton).click();
    }
    public String getLoginConfirmationText() {
        return driver.findElement(loginMessage).getText();
    }
}
