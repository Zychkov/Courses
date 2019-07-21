package Lesson6;

import java.util.Scanner;

public class PrintAndRead {
    private static double printAndRead (String s) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(s);

        double x = scanner.nextDouble ();

        return x;
    }

    public static void main(String[] args) {
        double x = printAndRead("Введите число:");

        System.out.println("Ваше число " + x);
    }
}
