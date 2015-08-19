/**
 * Created by lfgao on 8/18/15.
 */
public class Square {
    private double length;

    public Square(double length) {
        this.length = length;
    }


    public double getArea() {
        return this.length*this.length;
    }

    public double getPerimeter() {
        return 4*this.length;
    }
}
