package Lesson4;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int a = scanner.nextInt();

        int sum = 0;
        int x = a;

        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        System.out.printf("Сумма цифр в числе %d равна %d %n", a, sum);

        int evenSum = 0;
        int y = a;

        while (y != 0) {
            if (y % 2 == 1) {
                evenSum += (y % 10);
            }

            y /= 10;
        }
        System.out.printf("Сумма нечетных цифр в числе %d равна %d %n", a, evenSum);

        int z = a;
        int maxNumber = z % 10;

        while (z != 0) {
            int currentNumber = z % 10;
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            z /= 10;
        }
        System.out.printf("Максимальная цифра в числе %d равна %d %n", a, maxNumber);
    }
}
