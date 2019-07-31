package Lesson9;
//Написать функцию, которая ищет максимальное число в массиве вещественных чисел

public class FindMax {
    private static int getMaxNumberInArray(int[] array) {
        int maxNumberIndex = array [0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxNumberIndex]) {
                maxNumberIndex = i;
            }
        }

        return array[maxNumberIndex];
    }

    public static void main(String[] args) {
        int[] array = {4, 10, 17, 20, 5, 7};

        System.out.println("Максимальное число в массиве " + getMaxNumberInArray(array));
    }
}
//уменьшить количество итераций, вынести в функцию +