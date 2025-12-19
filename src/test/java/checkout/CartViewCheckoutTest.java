package checkout;

import base.BaseTest;
import org.testng.annotations.Test;


public class CartViewCheckoutTest extends BaseTest {

    @Test
    public void testCartCheckout() {
        checkoutProduct.ClickAddToCartButton();
    }
}
