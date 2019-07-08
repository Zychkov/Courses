package Coursework;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты 1й точки:");
        System.out.println("x1 = ");
        int x1 = scanner.nextInt();
        System.out.println("y1 = ");
        int y1 = scanner.nextInt();

        System.out.println("Введите координаты 2й точки:");
        System.out.println("x2 = ");
        int x2 = scanner.nextInt();
        System.out.println("y2 = ");
        int y2 = scanner.nextInt();

        System.out.println("Введите координаты 3й точки:");
        System.out.println("x3 = ");
        int x3 = scanner.nextInt();
        System.out.println("y3 = ");
        int y3 = scanner.nextInt();

        if (((x2 - x1) * (y3 - y2) - (x3 - x2) * (y2 - y1)) == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            //вычисляем длины сторон
            double a = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
            double b = Math.abs(Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)));
            double c = Math.abs(Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)));

            double p = (a + b + c) / 2; //полупериметр равен

            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));//площадь равна

            System.out.printf("Площадь равна %.2f", s);
        }
        /*/альтернативный вариант, если Satl = 0, то точки на 1й прямой
        double Salt = 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
        System.out.println("альт вариант " + Salt);
        */
    }
}

