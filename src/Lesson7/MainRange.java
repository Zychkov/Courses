package Lesson7;

import java.util.Scanner;

public class MainRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число начала диапазона");
        double from = scanner.nextInt();

        System.out.println("Введите число конца диапазона");
        double to = scanner.nextInt();

        System.out.println("Введите ваше число");
        double userNumber = scanner.nextInt();

        Range range1 = new Range(from, to);

        if (Range.isInside(userNumber, range1.getFrom(), range1.getTo())) {
            System.out.println("Ваша точка находится в диапазоне длиной " + Range.getLength(range1.getFrom(), range1.getTo()));
        } else if (userNumber < range1.getFrom()) {
            System.out.println("Ваша точка находится вне диапазона, меньше начала на " + (range1.getFrom() - userNumber));
        } else {
            System.out.println("Ваша точка находится вне диапазона, больше конца на " + (userNumber - range1.getTo()));
        }
    }
}

