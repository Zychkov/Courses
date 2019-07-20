package Coursework;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму банковского вклада:");
        double deposit = scanner.nextDouble();

        System.out.println("Введите процентную ставку:");
        double rate = scanner.nextDouble();

        System.out.println("Введите количество месяцев:");
        int depositTerm = scanner.nextInt();

        double depositWithPercent = deposit;

        for (int i = 1 ; i <= depositTerm ; i++) {
            depositWithPercent = depositWithPercent + (rate / 12 / 100) * depositWithPercent;
        }

        System.out.printf("Через %d месяцев сумма вашего вклада равна %.2f, чистая прибыль составила %.2f%n", depositTerm, depositWithPercent, (depositWithPercent - deposit));
    }
}
