package Lesson5;

import java.util.Scanner;

public class NumbersSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n = ");
        double n = scanner.nextDouble();

        for (int i = 1; i <= n; i++) {
            System.out.println("Квадраты чисел: " + (int) Math.pow(i, 2));
        }
    }
}
