package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private By userName = By.xpath("//input[@name='username' and @id='reg_username']");
    private By email = By.xpath("//input[@name='email' and  @id='reg_email']");
    private By password = By.xpath("//input[@name='password' and @id='reg_password']");
    private By registerButton = By.xpath("//button[@type='submit']");
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUserName(String text) {
        driver.findElement(userName).sendKeys(text);
    }
    public void enterEmail(String text) {
        driver.findElement(email).sendKeys(text);
    }
    public void enterPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }
    public void clickRegisterButton(){
driver.findElement(registerButton).click();
    }
}
