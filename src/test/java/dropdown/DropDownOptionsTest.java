package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DropDownOptionsTest extends BaseTest {
    @Test
    public void testDropdownOptions() {
       var store =homePage.navigateToStore();
       store.selectDropDownOption("Sort by average rating");
     assertEquals(store.getSelectedDropDownOptionText(), "Sort by average rating", "Incorrect selected option");

    }
}
