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
                break;
            case "sum":
                System.out.println("Введите 2 вещественных числа");
                System.out.println("a = ");
                double a = scanner.nextDouble();
                System.out.println("b = ");
                double b = scanner.nextDouble();
                System.out.printf("Сумма равна %.2f", a + b);
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
