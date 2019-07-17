package Lesson4;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число начала диапазона:");
        int a = scanner.nextInt();

        System.out.println("Введи число конца диапазона:");
        int b = scanner.nextInt();

        int i = a;
        int sum = 0;
        int count = 0;

        while (i <= b) {
            sum += i;
            ++i;
            ++count;
        }

        double arithmeticMean = (double) sum / count;
        System.out.printf("Среднее арифметическое = %.2f %n", arithmeticMean);

        int j = a;
        int evenSum = 0;
        int evenCount = 0;

        while (j <= b) {
            if (j % 2 == 0) {
                evenSum += j;
                ++evenCount;
            }
            ++j;
        }

        double evenArithmeticMean = (double) evenSum / evenCount;
        System.out.printf("Среднее арифметическое четных чисел = %.2f %n", evenArithmeticMean);
    }
}
