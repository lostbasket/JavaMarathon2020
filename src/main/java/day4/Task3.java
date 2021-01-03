package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[12][8];

        int maxSum = 0;
        int sumIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                //System.out.print(array[i][j] + " ");
            }

            //System.out.println();

            if (sum > maxSum) {
                maxSum = sum;
                sumIndex = i;
            }
        }
        //System.out.println();
        //System.out.println(maxSum);
        System.out.println(sumIndex);
    }
}

