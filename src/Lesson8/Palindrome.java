package Lesson8;

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(String palindrome) {
        int start = 0;
        int end = palindrome.length() - 1;

        while (end >= start) {
            if (palindrome.toLowerCase().charAt(end) == palindrome.toLowerCase().charAt(start)) {
                --end;
                ++start;
            } else if (!Character.isLetter(palindrome.toLowerCase().charAt(end))) {
                --end;
            } else {
                if (Character.isLetter(palindrome.toLowerCase().charAt(start))) {
                    return false;
                }

                ++start;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фразу:");
        String palindrome = scanner.nextLine();

        if (isPalindrome(palindrome)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это НЕ палиндром");
        }

    }
}

//Аргентина манит негра
