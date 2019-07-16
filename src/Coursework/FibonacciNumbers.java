package Coursework;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа Фибоначчи:");
        int n = scanner.nextInt();

        int fibonacciNumber = 0;

        if (n == 1) {
            fibonacciNumber = 1;
        } else {
            int fibonacciNumber1 = 0;
            int fibonacciNumber2 = 1;

            int i = 1;

            while (i < n) {
                fibonacciNumber = fibonacciNumber1 + fibonacciNumber2;
                fibonacciNumber1 = fibonacciNumber2;
                fibonacciNumber2 = fibonacciNumber;
                ++i;
            }
        }
        System.out.printf("Число Фибоначчи под номером n = %d равно %d", n, fibonacciNumber);
    }
}
