package Lesson9;
//Написать функцию, которая принимает массив строк и изменяет его, присваивая элементам эти же строки, но в которых все символы заглавные

import java.util.Arrays;

public class StringsArrayAtUpperCase {
    private static String getUpperCase(String[] userStringArray) {
        for (int i = 0; i < userStringArray.length; i++) {
            userStringArray[i] = userStringArray[i].toUpperCase();
        }

        return Arrays.toString(userStringArray);
    }

    public static void main(String[] args) {
        String[] userStringArray =  {"мама ", "мыла ", "раму "};

        System.out.println("Массив в верхнем регистре:");
        System.out.println(getUpperCase(userStringArray));
    }
}

// убрать второй массив+