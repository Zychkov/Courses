package Lesson4;

import java.util.Scanner;

public class SwithClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введите еще одну команду");
                String newCommand = scanner.nextLine();
                System.out.println("Ваша команда: " + newCommand);
        }
    }
}
