/**
 * Created by lfgao on 8/18/15.
 */
public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static Rectangle makeRectangle (double width, double height) {
        return new Rectangle(width, height);
    }

    public static Rectangle makeSquare (double length) {
        return new Rectangle(length, length);
    }
}
