package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Filter;

public class HomePage {
private WebDriver driver;
private By appStore = By.xpath("//a[contains(@href, 'app-store')]");
public HomePage(WebDriver driver) {
    this.driver = driver;
};
public void clickLink(String linkPage) {
    driver.findElement(By.linkText(linkPage)).click();
}
public StorePage navigateToStore() {
clickLink("Store");
return new StorePage(driver);
}
public RegisterPage goToRegister() {
clickLink("Account");
return new RegisterPage(driver);
};
public LoginPage goToLogin() {
    clickLink("Account");
    return new LoginPage(driver);
}
public FilterSlider goToFilterSliderPage() {
    clickLink("Store");
    return new FilterSlider(driver);
}
public GoToAppStorePage goToAppStore() {
     driver.findElement(appStore).click();
     return new GoToAppStorePage(driver);
}
}