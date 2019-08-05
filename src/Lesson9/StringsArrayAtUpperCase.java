package Lesson9;
//Написать функцию, которая принимает массив строк и изменяет его, присваивая элементам эти же строки, но в которых все символы заглавные

public class StringsArrayAtUpperCase {
    private static void upperCase(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].toUpperCase();
        }

        /*for (String e : stringArray) {
            System.out.println(e);
        }*/
    }

    public static void main(String[] args) {
        String[] stringArray = {"мама ", "мыла ", "раму "};

        System.out.println("Массив в верхнем регистре:");
        //getUpperCase(stringArray);      String[] newStringArray =

        StringsArrayAtUpperCase a = new StringsArrayAtUpperCase();
        a.upperCase(stringArray);

        StringsArrayAtUpperCase.upperCase(stringArray);

        /*for (String e : a) {
            System.out.println(e);
        }*/
    }
}

