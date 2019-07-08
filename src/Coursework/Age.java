package Coursework;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст от 1 года до 112 лет включительно:");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 112) {
            System.out.println("Вы слишком стары");
        } else {
            if ((age == 11) || (age == 12) || (age == 13) || (age == 14) || (age == 111) || (age == 112)) {
                String ending = "лет";
                System.out.printf("Вам %d %s", age, ending);
            } else if (age % 10 == 1) {
                String ending = "год";
                System.out.printf("Вам %d %s", age, ending);
            } else if ((age % 10 == 2) || (age % 10 == 3) || (age % 10 == 4)) {
                String ending = "года";
                System.out.printf("Вам %d %s", age, ending);
            } else {
                String ending = "лет";
                System.out.printf("Вам %d %s", age, ending);
            }
        }
    }
}



