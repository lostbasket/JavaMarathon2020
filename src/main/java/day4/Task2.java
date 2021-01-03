package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        //System.out.println(Arrays.toString(array));

        int maxNum = array[0];
        int minNum = array[0];
        int endingZero = 0;
        int sumEndingZero = 0;

        for (int i : array) {
            if (i < minNum) minNum = i;
            if (i > maxNum) maxNum = i;
            if (i % 10 == 0) {
                endingZero++;
                sumEndingZero += i;
            }
        }
        System.out.println("Наибольший элемент массива " + maxNum);
        System.out.println("Наименьший элемент массива " + minNum);
        System.out.println("Количество элементов массива, оканчивающихся на ноль: " + endingZero);
        System.out.println("Сумма элементов массива, оканчивающихся на ноль: " + sumEndingZero);
    }
}



