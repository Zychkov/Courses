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

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 && b != 0 && c != 0) {
            System.out.println("Это не квадратное уровнение, х = " + (-1 * c) / b);
        } else if ((a != 0 && b == 0 && c != 0) && (-1 * c / a) > 0) {
            double x1 = -1 * Math.sqrt(-1 * c / a);
            double x2 = Math.sqrt(-1 * c / a);
            System.out.printf("Корни квадратного уравнения: x1 = %.2f, x2 = %.2f", x1, x2);
        } else if ((a != 0 && b == 0 && c != 0) && (-1 * c / a) < 0) {
            System.out.println("Кореней квадратного уровнения нет");
        } else if (a != 0 && b != 0 && c == 0) {
            System.out.printf("Корни квадратного уравнения: x1 = 0, x2 = %.2f", (-1 * b / a));
        } else if (a != 0 && b == 0 && c == 0) {
            System.out.println("Корень квадратного уровнения х = 0");
        } else if ((a == 0 && b != 0 && c == 0)) {
            System.out.println("Корень квадратного уровнения х = 0");
        } else if ((a == 0 && b == 0 && c == 0) || (a == 0 && b == 0 && c != 0)) {
            System.out.println("Решения нет");
        } else if (discriminant > 0) {
            double x1 = (-1 * b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Корни квадратного уравнения: x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("Корень квадратного уравнения x = %.2f", x);
        } else {
            System.out.println("Кореней квадратного уровнения нет");
        }
    }
}
