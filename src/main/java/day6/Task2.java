package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2010, 73, 162);
        airplane.setYear(2015);
        airplane.setLength(80);
        airplane.fillUp(50000);
        airplane.fillUp(80000);
        airplane.info();

    }
}
