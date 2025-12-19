    package pages;

    import org.openqa.selenium.*;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.Select;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;

    public class CheckoutProduct {
        private WebDriver driver;
        private WebDriverWait wait;
        public CheckoutProduct(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }
        private By viewCart = By.xpath("//a[@href='https://askomdch.com/cart/']");
        private By firstName = By.xpath("//input[@name='billing_first_name']");
        private By lastName = By.xpath("//input[@name='billing_last_name']");
        private By company = By.id("billing_company");
        private By country = By.id("billing_country");
        private By address = By.id("billing_address_1");
        private By city = By.id("billing_city");
        private By state = By.id("billing_state");
        private By zip = By.id("billing_postcode");
        private By phone = By.id("billing_phone");
        private By email = By.id("billing_email");
        private By checkoutErrors = By.cssSelector(".woocommerce-error li");
        private By placeOrderButton = By.id("place_order");



        private By orderSuccessMessage = By.cssSelector(".woocommerce-notice--success");
            public void ClickAddToCartButton() {
            driver.findElement(By.xpath("//a[@data-product_id='1215']")).click();
            driver.findElement(viewCart).click();
        }

        public void proceedToCheckout() {
            ClickAddToCartButton();
            driver.findElement(viewCart).click();
            driver.findElement(By.className("wc-forward")).click();
        }

        public CheckoutProduct placeOrderInCheckout() {
            proceedToCheckout();
            return this;
        }
        public CheckoutProduct enterFirstName(String user_firstName) {
            driver.findElement(firstName).sendKeys(user_firstName);
            return this;
        }
        public CheckoutProduct enterLastName(String user_lastName) {
            driver.findElement(lastName).sendKeys(user_lastName);
            return this;
        }
        public CheckoutProduct enterCompany(String user_lastName) {
            driver.findElement(company).sendKeys(user_lastName);
            return this;
        }

        public CheckoutProduct enterAddress(String user_address) {
            driver.findElement(address).sendKeys(user_address);
            return this;
        }
        public CheckoutProduct enterCity(String user_city) {
            driver.findElement(city).sendKeys(user_city);
            return this;
        }
        public CheckoutProduct selectState(String stateName) {
            selectFromDropdown(state, stateName);
            return this;
        }

        public CheckoutProduct enterZip(String user_zip) {
            driver.findElement(zip).sendKeys(user_zip);
            return this;
        }
        public CheckoutProduct enterPhone(String user_phone) {
            driver.findElement(phone).sendKeys(user_phone);
            return this;
        }
        public CheckoutProduct enterEmail(String user_email) {
            driver.findElement(email).sendKeys(user_email);
            return this;
        }


        private void selectFromDropdown(By locator, String value) {
            WebElement element = wait.until(ExpectedConditions
                    .presenceOfElementLocated(locator));

            String tagName = element.getTagName();

            if (tagName.equalsIgnoreCase("select")) {
                new Select(element).selectByVisibleText(value);
            } else {
                element.click();
                element.sendKeys(value);
                element.sendKeys(Keys.ENTER);
            }
        }


       public CheckoutProduct placeOrder() {
            waitForLoaderToDisappear();
            waitingClick(placeOrderButton);

            wait.until(ExpectedConditions.or(
                    ExpectedConditions.visibilityOfElementLocated(orderSuccessMessage),
                    ExpectedConditions.visibilityOfElementLocated(checkoutErrors)
            ));

            return this;
        }




        public String getOrderSuccessMessage() {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(orderSuccessMessage)).getText();
        }

        public boolean hasCheckoutErrors() {
            return driver.findElements(checkoutErrors).size() > 0;
        }


        private void waitingClick(By locator) {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            try { Thread.sleep(200); } catch (InterruptedException ignored) {}

            element.click();
        }


        private void waitForLoaderToDisappear() {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector(".blockUI.blockOverlay")
            ));
        }
    }