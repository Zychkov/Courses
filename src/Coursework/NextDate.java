package Coursework;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сегодняшнюю дату");

        System.out.println("год:");
        int year = scanner.nextInt();

        System.out.println("месяц:");
        int month = scanner.nextInt();

        System.out.println("день:");
        int day = scanner.nextInt();

        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);

        int maxDayInMonth;

        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            maxDayInMonth = 30;
        } else if (isLeapYear && month == 2) {
            maxDayInMonth = 29;
        } else if (!isLeapYear && month == 2) {
            maxDayInMonth = 28;
        } else {
            maxDayInMonth = 31;
        }

        if (month < 1 || day < 1 || month > 12 || day > maxDayInMonth){
            System.out.println("Такой даты нет");
        } else if (day == maxDayInMonth && month == 12) {
            int nextDay = 1;
            int nextMonth = 1;
            int nextYear = year + 1;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, nextYear);
        } else if (day == maxDayInMonth) {
            int nextDay = 1;
            int nextMonth = month + 1;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, year);
        } else {
            int nextDay = day + 1;
            int nextMonth = month + 1;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, year);
        }
    }
}
