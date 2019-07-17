package Lesson5;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n = ");
        double n = scanner.nextDouble();

        for (int i = 2; i <= n; i++) {
            if (i % i == 1) {
            }

            System.out.println("");
        }

    }
}
