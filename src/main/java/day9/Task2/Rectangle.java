package day9.Task2;

public class Rectangle extends Figure {

    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double sRectangle = width * height;
        return sRectangle;
    }

    @Override
    public double perimeter() {
        double pRectangle = 2 * (width + height);
        return pRectangle;
    }
}
