package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;


public class TestNavigation extends BaseTest {
    @Test
    public void navigateToStoreTest() {
        var navigation = homePage.navigateToStore();
        assertEquals(navigation.getNavigateConfirmationText(), "Store", "Incorrect text message in store");

    }
}
