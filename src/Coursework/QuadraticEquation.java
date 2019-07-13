package Coursework;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите корни квадратного уравнения ax^2 + bx + c = 0");
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
        System.out.println("c = ");
        double c = scanner.nextDouble();

        if (a != 0) {
            System.out.println("Это квадратное уровнение");
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Корни квадратного уравнения: x1 = %.2f, x2 = %.2f", x1, x2);

            } else if (discriminant == 0) {
                double x = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Корень квадратного уравнения: x = %.2f", x);

            } else {
                System.out.print("Кореней квадратного уравнения нет");
            }

        } else if (b == 0 && c == 0) {
            System.out.print("Это не квадратное уровнение, которое имеет бесконечное множество корней");

        } else if (b != 0 && c == 0) {
            System.out.print("Это не квадратное уровнение, корень x = 0");

        } else if (b != 0 && c != 0) {
            System.out.printf("Это не квадратное уровнение, корень x = %.2f", (-c / b));

        } else {
            System.out.print("Это не квадратное уровнение, решения нет");
        }
    }
}
