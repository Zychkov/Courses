package Coursework;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст от 1 года до 112 лет включительно:");
        int age = scanner.nextInt();

        String ending = "";

        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 112) {
            System.out.println("Вы слишком стары");
        } else {
            if ((age % 100 == 11) || (age % 100 == 12) || (age % 100 == 13) || (age % 100 == 14)) {
                ending = "лет";
            } else if (age % 10 == 1) {
                ending = "год";
            } else if ((age % 10 == 2) || (age % 10 == 3) || (age % 10 == 4)) {
                ending = "года";
            } else {
                ending = "лет";
            }
        }
        System.out.printf("Вам %d %s", age, ending);
    }
}



