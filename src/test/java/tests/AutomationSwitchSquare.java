package tests;

import org.junit.jupiter.api.Test;
import pagesPart2.SquarePage;

public class AutomationSwitchSquare {
    SquarePage squarePage = new SquarePage();

    @Test
    public void testRun() {
        squarePage.openURL()
                .switchSquare()
                .checkSquare();
    }
}
