package day9.Task2;

public class Circle extends Figure {

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double sCircle = Math.PI * (radius * radius);
        return sCircle;
    }

    @Override
    public double perimeter() {
        double pCircle = 2 * Math.PI * radius;
        return pCircle;
    }
}
