package Coursework;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Угадайте целое число от 0 до 100");

        int unknownNumber = (int) Math.floor(Math.random() * 100);

        for (int i = 1 ; ; i++) {
            System.out.print("Введите ваше число: ");
            int userNumber = scanner.nextInt();

            if (userNumber == unknownNumber) {
                System.out.printf("Вы угадали, количество попыток = %d. Поздравляю !!!", i);
                break;

            } else if (userNumber > unknownNumber) {
                System.out.println("Ваше число слишком большое");

            } else System.out.println("Ваше число слишком маленькое");
        }
    }
}