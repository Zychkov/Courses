package Lesson9;
//Переставить элементы массива в обратном порядке

import java.util.Arrays;

public class RevertArray {
    private static void revertArray(String[] array){
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            String temporary = array[i];

            array[i] = array[j];
            array[j] = temporary;
        }
    }

    public static void main(String[] args) {
        String[] array = {"Мама ", "Мыла ", "Раму "};

        revertArray(array);

        System.out.println(Arrays.toString(array));
    }
}

