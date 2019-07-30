package Lesson9;
//Найти среднее арифметическое элементов массива, которые являются четными числами

public class ArithmeticMeanArray {
    public static void main(String[] args) {
        int[] array = {4, 10, 17, 20, 5, 7};

        int evenSum = 0;
        int evenCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenSum += e;

                evenCount++;
            }
        }

        System.out.printf("Среднее арифметическое массива = %.2f %n", (double) evenSum / evenCount);
    }
}