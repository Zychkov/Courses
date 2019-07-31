package Lesson9;
//Найти среднее арифметическое элементов массива, которые являются четными числами

import java.util.Scanner;

public class ArithmeticMeanArray {
    private static double getArithmeticMean(int[] array) {
        double evenSum = 0;
        int evenCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenSum += e;
                evenCount++;
            }
        }

        return evenSum / evenCount;
    }

    public static void main(String[] args) {
        int[] array = {4, 10, 17, 20, 5, 7};

        System.out.printf("Среднее арифметическое массива = %.2f %n", getArithmeticMean(array));
    }
}

//вынести в функцию +