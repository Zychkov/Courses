package Lesson9;
//Написать функцию, которая ищет указанное число в массиве, и если находит его, то выдает его индекс. А если не находит, то выдает 1

import java.util.Scanner;

public class FindElement {
    private static int getElementIndex(int userNumber, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNumber) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше число:");
        int userNumber = scanner.nextInt();

        int[] array = {4, 10, 17, 20, 5, 7};

        System.out.println("Индекс вашего числа в массиве = " + getElementIndex(userNumber, array));
    }
}
