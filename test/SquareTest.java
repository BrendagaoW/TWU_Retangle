import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lfgao on 8/18/15.
 */
public class SquareTest {
    @Test
    public void testAreaOfSquareShouldReturn16WhenLengthIs4() throws Exception {
        Square square = new Square(4);
        assertEquals(16, square.getArea(), 0);
    }

    @Test
    public void testAreaOfSquareShouldReturn9WhenLengthIs3() throws Exception {
        Square square = new Square(3);
        assertEquals(9, square.getArea(), 0);

    }

    @Test
    public void testPerimeterOfSquareShouldReturn16WhenLengthIs4() throws Exception {
        Square square = new Square(4);
        assertEquals(16, square.getPerimeter(), 0);

    }

    @Test
    public void testPerimeterOfSquareShouldReturn12WhenLengthIs3() throws Exception {
        Square square = new Square(3);
        assertEquals(12, square.getPerimeter(), 0);

    }


}
