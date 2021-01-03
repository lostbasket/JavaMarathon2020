package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Черный");
        car.setModel("Vesta");
        System.out.println("Год выпуска: " + car.getYear() +  "\n" + "Цвет: " + car.getColor() + "\n" + "Модель: " + car.getModel());
    }
}
