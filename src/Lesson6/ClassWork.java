package Lesson6;

import java.util.Scanner;

public class ClassWork {
    private static double getCalc3x4y (double x, double y) {
        return 3 * x + 4 * y;
    }

    private static double getArithmeticMean (int begin, int end) {
        int i;
        int sum = 0;
        int count = 0;

        for (i = begin; i <= end; i++) {
            sum += i;
            count ++;
        }

        return (double) sum / count;
    }

    private static int getMax(int a, int b) {
        return (a > b) ? a : b;
    }

    private static int getMin(int a, int b) {
        return (a > b) ? b : a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Результат функции = " + getCalc3x4y(3.1, 4.2));
        System.out.println("Результат функции = " + getCalc3x4y(156, 12.2));

        System.out.println("Введи число начала диапазона:");
        int begin = s.nextInt();

        System.out.println("Введи число конца диапазона:");
        int end = s.nextInt();

        System.out.println("Среднее арифметическое = " + getArithmeticMean(begin, end));

        System.out.println();
        System.out.println("Введите первое целое число: ");
        int a = s.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = s.nextInt();

        System.out.printf("Наибольшее число %d, наименьшее число %d", getMax(a, b), getMin(a, b));
    }
}