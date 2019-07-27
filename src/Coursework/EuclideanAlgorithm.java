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
        } else {
            int nod = 0;

            while (a != 0 && b != 0) {
                if (a % b == 0) {
                    nod = b;
                }

                int remainder = a % b;
                a = b;
                b = remainder;
            }

            System.out.println("НОД = " + nod);
        }
    }
}
