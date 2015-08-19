import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {

    Rectangle rectangle;

    @Before
    public void setUp() throws Exception {

        rectangle = new Rectangle(3, 5);
    }

    @Test
    public void testArea() {
        assertEquals(15.0, rectangle.getArea(), 0);
    }

    @Test
    public void testPerimeter() throws Exception {

        assertEquals(16, rectangle.getPerimeter(), 0);

    }

    @Test
    public void testSquareArea() throws Exception {
        Rectangle square = Rectangle.makeSquare(3);

        assertEquals(9, square.getArea(), 0);

    }
}
