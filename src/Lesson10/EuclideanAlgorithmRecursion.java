package Lesson10;

import java.util.Scanner;

public class EuclideanAlgorithmRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи первое число:");
        int a = scanner.nextInt();

        System.out.println("Введи второе число:");
        int b = scanner.nextInt();

        int gcd = getGreatestCommonDivisor(a, b);

        if (gcd == 0) {
            System.out.println("НОД не определен!");
        } else {
            System.out.println("НОД = " + gcd);
        }
    }

    private static int getGreatestCommonDivisor(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        } else if (a == 0 || b == 0) {
            return a + b;
        }

        return getGreatestCommonDivisor(b, a % b);
    }
}