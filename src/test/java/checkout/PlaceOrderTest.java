package checkout;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckoutProduct;

import static org.testng.Assert.assertEquals;

public class PlaceOrderTest extends BaseTest {
    @Test
    public void orderItemTest() {
     CheckoutProduct checkOutProduct = checkoutProduct.placeOrderInCheckout();
    checkOutProduct.enterFirstName("John");
    checkOutProduct.enterLastName("Doe");
    checkOutProduct.enterCompany("123 Main St.");
    checkOutProduct.enterAddress("KK 520 ST");
    checkOutProduct.enterCity("New York");
    checkOutProduct.enterZip("12345");
    checkOutProduct.enterPhone("12047331"); //change to int
        checkOutProduct.enterEmail("stevo@gmail.com");
        checkOutProduct.placeOrder();
        assertEquals(
                checkoutProduct.getOrderSuccessMessage(),
                "Thank you. Your order has been received.",
                "Oops! Order not received."
        );






//        checkoutProduct.EnterFirstName("Steven");
//        checkoutProduct.EnterLastName("Cyubahiro");
//        // checkoutProduct.selectCountry();
//        checkoutProduct.enterStreetAddress("Kigali");
//        checkoutProduct.enterCity("Kicukiro");
//   checkoutProduct.clickPlaceOrder();
    }
}
