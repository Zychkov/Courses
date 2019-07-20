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

        int i = x;
        int symbolCount = 1;

        String stringNumberX = Integer.toString(x);
        String stringNumberY = Integer.toString(y);

        int lengthNumberX = stringNumberX.length();
        int lengthNumberY = stringNumberY.length();
        int lengthNumber;

        if (lengthNumberX >= lengthNumberY) {
            lengthNumber = lengthNumberX;
        } else {
            lengthNumber = lengthNumberY;
        }

        while (i <= y) {
            System.out.printf("%" + (lengthNumber + 1) + "d", i);

            if (symbolCount % n == 0) {
                System.out.println();
            }

            symbolCount++;
            i++;
        }
    }
}
