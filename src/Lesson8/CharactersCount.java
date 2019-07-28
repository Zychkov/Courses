package Lesson8;

import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String line = scanner.nextLine();

        int letterSymbolsCount = 0;
        int digitSymbolsCount = 0;
        int spacesCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i < line.length(); ++i) {
            char symbol = line.charAt(i);

            if (Character.isLetter(symbol)) {
                letterSymbolsCount += 1;
            } else if (Character.isDigit(symbol)) {
                digitSymbolsCount += 1;
            } else if (Character.isWhitespace(symbol)) {
                spacesCount += 1;
            } else {
                otherSymbolsCount += 1;
            }
        }

        System.out.println("Количество букв = " + letterSymbolsCount);
        System.out.println("Количество цифр = " + digitSymbolsCount);
        System.out.println("Количество пробелов  = " + spacesCount);
        System.out.println("Количество других символов  = " + otherSymbolsCount);
    }
}
