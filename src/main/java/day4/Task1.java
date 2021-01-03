package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int k = array.length;
        int moreEight = 0;
        int equalOne = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
            System.out.println(array[i] + " ");
            if (array[i] > 8) moreEight++;
            if (array[i] == 1) equalOne++;
            if (array[i] % 2 == 0) even++;
            if (array[i] % 2 != 0) odd++;
            sum += array[i];
        }
        System.out.println("Длина массива: " + k);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
