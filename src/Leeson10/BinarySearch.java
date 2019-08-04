package Leeson10;

import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    private static int binarySearch(int[] array, int left, int right, int number) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (array[middle] == number) {
            return middle;
        } else if (number > array[middle]) {
            return binarySearch(array, middle + 1,right,number);
        } else {
            return binarySearch(array, left,middle - 1,number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {4, 5, 7, 10, 12, 20};

        int left = 0;
        int right = array.length - 1;

        System.out.println("Введи число:");
        int number = scanner.nextInt();

        int result = binarySearch(array, left, right, number);

        if (result == -1) {
            System.out.println("Числа нет в массиве " + result);
        } else {
            System.out.println("Число найдено в массиве, индекс = " + result);
        }
    }
}


