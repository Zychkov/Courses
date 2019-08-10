package Lesson8;

import java.util.Scanner;

public class MaximumSubstring {
    private static int getSimilarSymbolsQuantity(String userLine) {
        if (userLine.isEmpty()) {
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