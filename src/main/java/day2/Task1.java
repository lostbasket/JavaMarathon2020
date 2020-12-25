package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b < 5 && b > 0) {
            System.out.println("Малоэтажный дом");
        } else if (b < 9 && b > 4) {
            System.out.println("Среднеэтажный дом");
        } else if (b > 8) {
            System.out.println("Многоэтажный дом");
        } else System.out.println("Ошибка ввода");
    }
}
