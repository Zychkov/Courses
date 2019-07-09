package Coursework;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты 1й точки:");
        System.out.println("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.println("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты 2й точки:");
        System.out.println("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.println("y2 = ");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты 3й точки:");
        System.out.println("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.println("y3 = ");
        double y3 = scanner.nextDouble();

        if (((x2 - x1) * (y3 - y2) - (x3 - x2) * (y2 - y1)) == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            //вычисляем длины сторон
            double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

            double semiPerimeter = (a + b + c) / 2;
            double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

            System.out.printf("Площадь равна %.2f", triangleArea);
        }
    }
}

