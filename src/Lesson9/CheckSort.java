package Lesson9;
//Написать функцию, которая проверяет, что массив отсортирован по возрастанию
//Написать функцию, которая проверяет, что массив отсортирован по убыванию

public class CheckSort {
    private static boolean isSortedByAscending(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedByDescending(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {20, 20, 10, 7, 5, 4};

        if (isSortedByAscending(array)) {
            System.out.println("Массив отсортирован по возрастанию");
        } else if (isSortedByDescending(array)){
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }
}