package login;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() {
       var loginIt = homePage.goToLogin();
        loginIt.login("steve531", "new@keplercollege@25");
        assertEquals(loginIt.getLoginConfirmationText(), "From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.", "Incorrect text message in login");
    }
}
