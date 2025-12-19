package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.CheckoutProduct;
import pages.HomePage;

public class BaseTest {
private WebDriver driver;
protected HomePage homePage;
protected CheckoutProduct checkoutProduct;

@BeforeClass
    public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
    checkoutProduct = new CheckoutProduct(driver);
    driver.get("https://askomdch.com/");
}
}
