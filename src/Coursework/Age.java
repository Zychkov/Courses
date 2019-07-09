package Coursework;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст от 1 года до 112 лет включительно:");
        int age = scanner.nextInt();

        String ending;

        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 112) {
            System.out.println("Вы слишком стары");
        } else {
            int divisionRemainder100 = age % 100;
            int divisionRemainder10 = age % 10;

            if ((divisionRemainder100 == 11) || (divisionRemainder100 == 12) || (divisionRemainder100 == 13) || (divisionRemainder100 == 14)) {
                ending = "лет";
            } else if (age % 10 == 1) {
                ending = "год";
            } else if ((divisionRemainder10 == 2) || (divisionRemainder10 == 3) || (divisionRemainder10 == 4)) {
                ending = "года";
            } else {
                ending = "лет";
            }

            System.out.printf("Вам %d %s", age, ending);
        }
    }
}



