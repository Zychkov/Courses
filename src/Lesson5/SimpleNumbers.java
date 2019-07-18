package Lesson5;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n = ");
        int n = scanner.nextInt();

        boolean isPrime = true;
        int j;

        for (int i = 2; i <= n; i++) {
            for (j = 2; j < i ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
            System.out.println(j);
            } else isPrime = true;
        }
    }
}
