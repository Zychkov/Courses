package Coursework;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        for ( ; a != 0 && b != 0; ) {
            if (a > b) {
                a = a % b;
            } else b = b % a;
        }

        System.out.println("НОД = " + (a + b));
    }
}
