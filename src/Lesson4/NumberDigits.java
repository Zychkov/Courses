package Lesson4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int userNumber = scanner.nextInt();

        int sum = 0;
        int x = userNumber;

        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        System.out.printf("Сумма цифр в числе %d равна %d %n", userNumber, sum);

        int unevenDigitsSum = 0;
        int y = userNumber;

        while (y != 0) {
            if (y % 2 == 1) {
                unevenDigitsSum += (y % 10);
            }

            y /= 10;
        }
        System.out.printf("Сумма нечетных цифр в числе %d равна %d %n", userNumber, unevenDigitsSum);

        int z = userNumber;
        int maxDigit = z % 10;

        while (z != 0) {
            int currentDigit = z % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            z /= 10;
        }
        System.out.printf("Максимальная цифра в числе %d равна %d %n", userNumber, maxDigit);
    }
}
