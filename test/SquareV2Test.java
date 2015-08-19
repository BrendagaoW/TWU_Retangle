import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lfgao on 8/18/15.
 */
public class SquareV2Test {
    @Test
    public void testAreaOfSquareShouldReturn9WhenLengthIs3() throws Exception {
        SquareV2 square = new SquareV2(3);
        assertEquals(9, square.getArea(), 0);

    }
}
