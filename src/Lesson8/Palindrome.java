package Lesson8;

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(String phraseForCheck) {
        phraseForCheck = phraseForCheck.toLowerCase();

        int start = 0;
        int end = phraseForCheck.length() - 1;

        while (end >= start) {
            if (!Character.isLetter(phraseForCheck.charAt(end))) {
                --end;
            } else if (!Character.isLetter(phraseForCheck.charAt(start))) {
                ++start;
            } else if (phraseForCheck.charAt(end) == phraseForCheck.charAt(start)) {
                --end;
                ++start;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фразу:");
        String phraseForCheck = scanner.nextLine();

        if (isPalindrome(phraseForCheck)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это НЕ палиндром");
        }
    }
}

//Аргентина манит негра

