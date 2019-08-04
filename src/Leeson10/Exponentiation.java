package Leeson10;

import java.util.Scanner;

public class Exponentiation {
    private static int getPower(int number, int power) {
        if (power == 0)
            return 1;

        return getPower(number, power - 1) * number;
    }

    private static int powWithoutRecursion(int a, int n) {
        int result = 1;

        if (n == 0)
            return 1;

        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число:");
        int number = scanner.nextInt();

        System.out.println("Введи степень:");
        int power = scanner.nextInt();

        System.out.println(getPower(number, power));
        System.out.println(powWithoutRecursion(number, power));
    }
}