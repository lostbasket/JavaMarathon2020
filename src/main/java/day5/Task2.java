package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(1980, "Black", "Gold Wing");
        System.out.println("Год выпуска: " + motorbike.getYear() + "\n" + "Цвет: " + motorbike.getColor() + "\n" + "Модель: " + motorbike.getModel());
    }
}
