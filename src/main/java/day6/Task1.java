package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.info();
        car.setYear(2005);
        System.out.println(car.yearDifference(2001));

        Motorbike motorbike = new Motorbike(2010, "White", "Suzuki");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2000));


    }
}
