package Lesson2;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double a = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double b = scanner.nextDouble();

        System.out.printf("Длина прямоугольника = %.2f%nШирина прямоугольника = %.2f%nПлощадь прямоугольника = %.2f%nПериметр прямоугольника = %.2f%n", a, b, a * b, 2 * (a + b));
    }
}
