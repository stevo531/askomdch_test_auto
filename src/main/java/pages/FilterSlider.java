package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FilterSlider {
    private WebDriver driver;
    private By slider = By.className("ui-slider-handle");

    public FilterSlider(WebDriver driver) {
        this.driver = driver;
    }
    public void useSlider() {
        WebElement sliderHandle = driver.findElement(slider);
        Actions actions = new Actions(driver);
        actions.clickAndHold(sliderHandle).moveByOffset(100, 0).release().perform();
    }
}
