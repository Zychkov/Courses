package Lesson8;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Palindrome {
    private static boolean isPalindrome(String palindrome) {
        char[] lettersArray = palindrome.toLowerCase().toCharArray();

        for (int i = 0; i <= lettersArray.length / 2; i++) {
            if (!isLetter(lettersArray[i])){
                lettersArray[i] = lettersArray[i + 1];
            }

            if (lettersArray[i] != lettersArray[lettersArray.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для проверки палиндрома: ");

        String palindrome = scanner.nextLine();

        if (isPalindrome(palindrome)) {
            System.out.println("Это палиндром!");
        } else {
            System.out.println("Это не палиндром");
        }
    }
}

//Аргентина манит негра
