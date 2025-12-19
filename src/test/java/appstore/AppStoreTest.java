package appstore;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppStoreTest extends BaseTest {
    @Test
    public void testAppStore() {homePage.goToAppStore();}
}
