package Lesson9;

import java.util.Scanner;

public class FindElement {
    private static int getElementIndex(int userNumber) {
        int[] array = {4, 10, 17, 20, 5, 7};

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

        System.out.println("Индекс вашего числа в массиве = " + getElementIndex(userNumber));
    }
}
