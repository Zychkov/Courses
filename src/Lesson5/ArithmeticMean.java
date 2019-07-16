package Lesson5;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число начала диапазона:");
        int a = scanner.nextInt();

        System.out.println("Введи число конца диапазона:");
        int b = scanner.nextInt();

        int i;
        int sum = 0;
        int count = 0;

        for (i = a; i <= b; i++) {
            sum += i;
            count ++;
        }

        System.out.printf("Среднее арифметическое = %.2f %n", (double) sum / count);
    }
}
