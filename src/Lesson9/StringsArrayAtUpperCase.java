package Lesson9;
//Написать функцию, которая принимает массив строк и изменяет его, присваивая элементам эти же строки, но в которых все символы заглавные

import java.util.Arrays;
import java.util.Scanner;

public class StringsArrayAtUpperCase {
    private static String getUpperCase(String[] userStringArray) {
        String[] stringArray = new String[6];

        for (int i = 0; i < userStringArray.length; i++) {
            stringArray[i] = userStringArray[i].toUpperCase();
        }

        return Arrays.toString(stringArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите массив из 6 строк:");
        String[] userStringArray = new String[6];
        userStringArray[0] = scanner.nextLine();
        userStringArray[1] = scanner.nextLine();
        userStringArray[2] = scanner.nextLine();
        userStringArray[3] = scanner.nextLine();
        userStringArray[4] = scanner.nextLine();
        userStringArray[5] = scanner.nextLine();

        System.out.println("Массив в верхнем регистре:");
        System.out.println(getUpperCase(userStringArray));
    }
}
