package Lesson4;

import java.util.Scanner;

public class Epsilon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи первое вещественное число");
        double a = scanner.nextDouble();

        System.out.println("Введи второе вещественное число");
        double b = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a - b) <= epsilon) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа НЕ равны");
        }
    }
}
