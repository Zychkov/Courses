package Lesson4;

import java.util.Scanner;

public class TenNumbersPerLine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число начала диапазона x = ");
        int x = scanner.nextInt();

        System.out.print("Введи число конца диапазона y = ");
        int y = scanner.nextInt();

        System.out.print("Введи количество символов в строке n = ");
        int n = scanner.nextInt();

        int i = x - 1;

        while (i < y) {
            i++;

            System.out.printf("%4d", i);

            if (i % n == 0) {
                System.out.println(System.lineSeparator());
            }
        }
    }
}
