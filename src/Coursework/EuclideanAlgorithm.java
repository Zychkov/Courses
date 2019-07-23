package Coursework;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите большее число:");
        int a = scanner.nextInt();

        System.out.println("Введите меньшее число:");
        int b = scanner.nextInt();

        int nod = 0;
        int reminder;

        if (a == 0 && b == 0) {
            System.out.println("НОД не определен!");
        } else {
            while (a != 0 && b != 0) {
                if (a % b == 0) {
                    nod = b;
                }

                reminder = a % b;
                a = b;
                b = reminder;
            }

            System.out.println("НОД = " + nod);
        }
    }
}
