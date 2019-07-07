package Lesson3;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number == 0) {
            System.out.println("Число = 0");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}