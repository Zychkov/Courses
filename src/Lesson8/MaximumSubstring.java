package Lesson8;

import java.util.Scanner;

public class MaximumSubstring {
    private static int getSimilarSymbolsQuantity(String userLine) {
        int charsInSubstringCount = 1;
        int temporaryCharsInSubstringCount = 1;

        if (userLine.equals("")){
            charsInSubstringCount = 0;
            temporaryCharsInSubstringCount = 0;
        }

        for (int i = 0; i < userLine.length() - 1; i++) {
            if (Character.toLowerCase(userLine.charAt(i)) == Character.toLowerCase(userLine.charAt(i + 1))) {
                temporaryCharsInSubstringCount++;
            } else if(temporaryCharsInSubstringCount > charsInSubstringCount) {
                charsInSubstringCount = temporaryCharsInSubstringCount;

                temporaryCharsInSubstringCount = 0;
            }
        }

        if (temporaryCharsInSubstringCount > charsInSubstringCount) {
            return (temporaryCharsInSubstringCount);
        } else {
            return (charsInSubstringCount);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольную строку");
        String userLine = scanner.nextLine();

        System.out.println("Максимальная длина подстроки = " + getSimilarSymbolsQuantity(userLine));
    }
}