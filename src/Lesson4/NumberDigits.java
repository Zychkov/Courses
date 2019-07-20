package Lesson4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int userNumber = scanner.nextInt();

        int x = userNumber;

        int sum = 0;
        int unevenDigitsSum = 0;
        int maxDigit = x % 10;

        while (x != 0) {
            sum += (x % 10);

            if (x % 2 == 1) {
                unevenDigitsSum += (x % 10);
            }

            int currentDigit = x % 10;

            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }

            x /= 10;
        }

        System.out.printf("Сумма цифр в числе %d равна %d %n", userNumber, sum);

        System.out.printf("Сумма нечетных цифр в числе %d равна %d %n", userNumber, unevenDigitsSum);

        System.out.printf("Максимальная цифра в числе %d равна %d %n", userNumber, maxDigit);
    }
}
