package Coursework;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("НОД не определен!");
        } else if (a == 0 || b == 0) {
            System.out.println("НОД = " + (a + b));
        } else {
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            System.out.println("НОД = " + a);
        }
    }
}

