package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StorePage {
    private WebDriver driver;
    private By confirmatioMessage = By.className("page-title");
    private By selectDropDownBy = By.xpath("//select[@aria-label='Shop order']");
    public StorePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getNavigateConfirmationText() {
      return driver.findElement(confirmatioMessage).getText();
    }
    public void selectDropDownOption(String option) {
        Select dropDown = new Select(driver.findElement(selectDropDownBy));
        dropDown.selectByVisibleText(option);
      //  String getSelectedOption = dropDown.getFirstSelectedOption().getText();

    }
    public String getSelectedDropDownOptionText() {
        return new Select(driver.findElement(selectDropDownBy))
                .getFirstSelectedOption().getText();
    }

}
