package checkout;

import base.BaseTest;
import org.testng.annotations.Test;

public class ProceedToCheckoutTest extends BaseTest {
    @Test
    public void testProceedToCheckout() {
    checkoutProduct.proceedToCheckout();
    }
}
