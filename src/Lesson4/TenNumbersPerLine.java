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

        String numberXstring = Integer.toString(x);
        String numberYstring = Integer.toString(y);

        int numberXLength = numberXstring.length();
        int numberYLength = numberYstring.length();
        int numberLength;

        if (numberXLength >= numberYLength) {
            numberLength = numberXLength;
        } else {
            numberLength = numberYLength;
        }

        int i = x;
        int digitsCount = 1;

        while (i <= y) {
            System.out.printf("%" + (numberLength + 1) + "d", i);

            if (digitsCount % n == 0) {
                System.out.println();
            }

            digitsCount++;
            i++;
        }
    }
}
