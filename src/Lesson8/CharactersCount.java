package Lesson8;

import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String line = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;
        int othersCount = 0;

        for (int i = 0; i < line.length(); ++i) {
            char symbol = line.charAt(i);

            if (Character.isLetter(symbol)) {
                lettersCount++;
            } else if (Character.isDigit(symbol)) {
                digitsCount++;
            } else if (Character.isWhitespace(symbol)) {
                spacesCount++;
            } else {
                othersCount++;
            }
        }

        System.out.println("Количество букв = " + lettersCount);
        System.out.println("Количество цифр = " + digitsCount);
        System.out.println("Количество пробелов  = " + spacesCount);
        System.out.println("Количество других символов  = " + othersCount);
    }
}
