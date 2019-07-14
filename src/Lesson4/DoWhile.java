package Lesson4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число начала диапазона:");
        int a = scanner.nextInt();

        System.out.println("Введи число конца диапазона:");
        int b = scanner.nextInt();

        int i = a;
        int sum = 0;
        int count = 0;

        do {
            sum += i;
            ++i;
            ++count;
            //System.out.printf("Sum = %d, i = %d, count = %d %n", sum, i, count);
        } while (i <= b);

        double arithmeticMean = (double) sum / count;
        System.out.printf("Среднее арифметическое = %.2f %n", arithmeticMean);

        int j = a;
        int evenSum = 0;
        int evenCount = 0;

        do {
            if (j % 2 == 0) {
                evenSum += j;
                ++evenCount;
                //System.out.printf("evenSum = %d, k = %d, evenCount = %d %n", evenSum, j, evenCount);
            }

            ++j;
        } while (j <= b);

        double evenArithmeticMean = (double) evenSum / evenCount;
        System.out.printf("Среднее арифметическое четных чисел = %.2f %n", evenArithmeticMean);
    }
}
