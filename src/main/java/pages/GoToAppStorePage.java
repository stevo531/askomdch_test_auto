package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoToAppStorePage {
    private WebDriver driver;
    private By appStoreText = By.xpath("//h2[contains(normalize-space(), 'The apps you love.')]");
    public  GoToAppStorePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAppStoreConfirmationText(){
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     //   wait.until(ExpectedConditions.presenceOfElementLocated(appStoreText));
        return driver.findElement(appStoreText).getText();

    }
}
