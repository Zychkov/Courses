package Lesson8;

import java.util.Scanner;

public class MaximumSubstring {
    private static int getMaxSubstring(String userLine) {
        int charsInSubstringCount = 0;
        int temporaryCharsInSubstringCount = 0;

        for (int i = 0; i < userLine.length() - 1; ++i) {
            if (userLine.charAt(i) == userLine.charAt(i + 1)) {
                temporaryCharsInSubstringCount += 1;
            } else if (temporaryCharsInSubstringCount > charsInSubstringCount) {
                charsInSubstringCount = temporaryCharsInSubstringCount;

                temporaryCharsInSubstringCount = 0;
            }
        }

        if (temporaryCharsInSubstringCount > charsInSubstringCount) {
            return (temporaryCharsInSubstringCount + 1);
        } else return (charsInSubstringCount + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольную строку");
        String userLine = scanner.nextLine();

        System.out.println("Максимальная длина подстроки = " + getMaxSubstring(userLine));
    }
}