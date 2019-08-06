package Lesson8;

import java.util.Scanner;

public class MaximumSubstring {
    private static int getSimilarSymbolsQuantity(String userLine) {
        if (userLine.equals("")) {
            return 0;
        }

        int charsInSubstringCount = 1;
        int temporaryCharsInSubstringCount = 1;

        userLine = userLine.toLowerCase();

        for (int i = 0; i < userLine.length() - 1; i++) {
            if (userLine.charAt(i) == userLine.charAt(i + 1)) {
                temporaryCharsInSubstringCount++;
            } else if (temporaryCharsInSubstringCount > charsInSubstringCount) {
                charsInSubstringCount = temporaryCharsInSubstringCount;

                temporaryCharsInSubstringCount = 1;
            } else {
                temporaryCharsInSubstringCount = 1;
            }
        }

        if (temporaryCharsInSubstringCount > charsInSubstringCount) {
            return temporaryCharsInSubstringCount;
        }

        return charsInSubstringCount;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольную строку");
        String userLine = scanner.nextLine();

        System.out.println("Максимальная длина подстроки = " + getSimilarSymbolsQuantity(userLine));
    }
}

        /*
        1. Если строка пустая, то нужно сразу возвращать результат функции.
        И эта проверка должна быть в самом начале функции +

        2. Неправильный результат для строки 1112221222 +

        3. После ветки if, заканчивающейся на return, не нужен else +

        4. Лишние скобки в return +

        5. Код не отформатирован +

         */

