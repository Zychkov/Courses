package Lesson3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("if - else");
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.printf("Наибольшее число %d, наименьшее число %d", number1, number2);
        } else {
            System.out.printf("Наибольшее число %d, наименьшее число %d", number2, number1);
        }

        System.out.println(System.lineSeparator());
        System.out.println("Тернарный оператор");
        System.out.println("Введите первое целое число: ");
        int number3 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number4 = scanner.nextInt();

        int max = (number3 > number4) ? number3 : number4;
        int min = (number3 > number4) ? number4 : number3;
        System.out.printf("Наибольшее число %d, наименьшее число %d", max, min);
    }
}