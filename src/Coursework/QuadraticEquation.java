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

        double epsilon = 1.0e-10;

        if (Math.abs(a) > epsilon) {
            System.out.println("Это квадратное уровнение");

            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > epsilon) {
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);

                System.out.printf("Корни квадратного уравнения: x1 = %.2f, x2 = %.2f", x1, x2);
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);

                System.out.printf("Корень квадратного уравнения: x = %.2f", x);
            } else {
                System.out.print("Кореней квадратного уравнения нет");
            }
        } else if (Math.abs(b) <= epsilon && Math.abs(c) <= epsilon) {
            System.out.print("Это уровнение имеет бесконечное множество корней");
        } else if (Math.abs(b) > epsilon) {
            System.out.printf("Это не квадратное уровнение, корень x = %.2f", (-c / b));
        } else {
            System.out.print("Решения нет");
        }
    }
}


//Ошибка в первой проверке дискриминанта 1 6 9