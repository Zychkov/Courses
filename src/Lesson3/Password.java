package Lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "Пароль";

        System.out.println("Введите пароль");
        String userPassword = scanner.nextLine();

        if (password.equals(userPassword)) {
            System.out.println("Пароль верный");
        } else {
            int passwordLength = password.length();
            int userPasswordLength = userPassword.length();

            if (passwordLength > userPasswordLength) {
                System.out.println("Пароль неверный, слишком короткий");
            } else if (passwordLength < userPasswordLength){
                System.out.println("Пароль неверный, слишком длинный");
            } else {
                System.out.println("Пароль неверный");
            }
        }
    }
}
