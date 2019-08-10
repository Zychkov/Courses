package Lesson9;
//Написать функцию, которая принимает массив строк и изменяет его, присваивая элементам эти же строки, но в которых все символы заглавные

public class StringsArrayAtUpperCase {
    private static void arrayToUpperCase(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"мама ", "мыла ", "раму "};

        System.out.println("Массив в верхнем регистре:");

        arrayToUpperCase(stringArray);

        for (String e : stringArray) {
            System.out.println(e);
        }
    }
}

