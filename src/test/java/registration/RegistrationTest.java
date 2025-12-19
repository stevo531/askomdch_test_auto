package registration;

import base.BaseTest;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    @Test
    public void testRegistration() {
      var register =  homePage.goToRegister();
      register.enterUserName("steven@12");
        register.enterEmail("steviee@gmail.com");
      register.enterPassword("steviee");
        register.clickRegisterButton();
    }
}
