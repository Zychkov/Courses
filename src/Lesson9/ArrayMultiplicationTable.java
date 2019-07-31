package Lesson9;
//Написать функцию, которая создает двумерный массив с таблицей умножения
//Размер таблицы должен быть параметром функции

import java.util.Scanner;

public class ArrayMultiplicationTable {
    private static int[][] getArray(int tableSize) {
        int[][] array = new int[tableSize][tableSize];

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер таблицы:");
        int tableSize = scanner.nextInt();

        int[][] array = getArray(tableSize);

        //System.out.println(Arrays.deepToString(array) + "\n");

        for (int[] e : array) {
            for (int a : e) {
                System.out.print(a + "\t");
            }

            System.out.println();
        }
    }
}

