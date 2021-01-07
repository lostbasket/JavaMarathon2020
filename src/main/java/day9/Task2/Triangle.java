package day9.Task2;

public class Triangle extends Figure {

    double a;
    double b;
    double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double semiPerimeter = (a + b + c) / 2;
        double h = (2 / a) * Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        double sTriangle = (a * h) / 2;
        return sTriangle;
    }

    @Override
    public double perimeter() {
        double pTriangle = a + b + c;
        return pTriangle;
    }
}
