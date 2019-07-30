package Lesson9;
//Написать функцию, которая ищет максимальное число в массиве вещественных чисел

public class FindMax {
    public static void main(String[] args) {
        int[] array = {4, 10, 17, 20, 5, 7};

        int maxNumberIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxNumberIndex]) {
                maxNumberIndex = i;
            }
        }

        System.out.println("Максимальное число в массиве " + array[maxNumberIndex]);
    }
}