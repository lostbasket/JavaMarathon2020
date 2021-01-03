package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int maxSum = 0;
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        //System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                sumIndex = i;
            }
            //System.out.println("Наибольший элемент массива " + sum);
        }
        //System.out.println();
        System.out.println(maxSum);
        System.out.println(sumIndex);

    }
}
