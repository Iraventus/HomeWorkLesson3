package tests;

import org.junit.jupiter.api.Test;
import pages.SquarePage;

public class AutomationSwitchSquare {
    SquarePage squarePage = new SquarePage();

    @Test
    public void testRun() {
        squarePage.openURL()
                .switchSquare()
                .checkSquare();
    }
}
