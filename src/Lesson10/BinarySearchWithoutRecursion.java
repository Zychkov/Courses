package Lesson10;

import java.util.Scanner;

public class BinarySearchWithoutRecursion {
    private static int binarySearchWithoutRecursion(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == number) {
                return middle;
            } else if (array[middle] > number) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {4, 5, 7, 10, 12, 20};

        System.out.println("Введи число:");
        int number = scanner.nextInt();

        int result = binarySearchWithoutRecursion(array, number);

        if (result == -1) {
            System.out.println("Числа нет в массиве, индекс = " + result);
        } else {
            System.out.println("Число найдено в массиве, индекс = " + result);
        }
    }
}
