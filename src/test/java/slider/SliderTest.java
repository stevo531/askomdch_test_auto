package slider;

import base.BaseTest;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {
    @Test
    public void testSliderToLeft() {
        var sliderPage = homePage.goToFilterSliderPage();
        sliderPage.useSlider();
    }
}
