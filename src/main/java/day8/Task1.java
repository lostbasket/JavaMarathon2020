package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = new String();

        long start1 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            str = str + i + " ";
        }

        long finish1 = System.currentTimeMillis();

        System.out.println("Время выполнения цикла 1: " + (finish1 - start1) + " миллисекунд");
        System.out.println(str);

        StringBuilder strBl = new StringBuilder();

        long start2 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            strBl.append(i + " ");
        }

        long finish2 = System.currentTimeMillis();

        System.out.println();
        System.out.println("Время выполнения цикла 2: " + (finish2 - start2) + " миллисекунд");

        System.out.println(strBl);

    }
}
