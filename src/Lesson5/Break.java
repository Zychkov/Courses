package Lesson5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "break";

        for ( ; ; ) {
            System.out.println("Введите слово:");
            String userWord = scanner.nextLine();

            if (word.equals(userWord)) {
                System.out.println("Вы угадали!!!");
                break;
            }
            System.out.println("Попробуйте еще раз");
        }
    }
}
