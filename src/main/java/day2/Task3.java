package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = a + 1;
        if (a < b)
            while (a < b) {
                if (a % 5 == 0 && a % 10 != 0)
                    System.out.print(a + " ");
                a++;
            }
        else System.out.println("Некорректный ввод");
    }

}

