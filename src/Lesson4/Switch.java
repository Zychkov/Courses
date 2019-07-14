package Lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое вещественное число:");
        double a = scanner.nextDouble();

        System.out.println("Введите второе вещественное число:");
        double b = scanner.nextDouble();

        System.out.println("Введите код команды:");
        int code = scanner.nextInt();

        switch (code) {
            case 1:
                System.out.println("Сумма чисел a + b = " + (a + b));
                break;
            case 2:
                System.out.println("Разность чисел a - b = " + (a - b));
                break;
            case 3:
                System.out.println("Произведение чисел a * b = " + (a * b));
                break;
            case 4:
                System.out.println("Частное чисел a / b = " + (a / b));
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
