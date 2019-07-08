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

        int leapYear = 0;
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            leapYear = leapYear + 1;
        }

        if (month < 1 || day < 1 || month > 12 || ((month == 2) && (leapYear == 1) && (day > 29) || ((month == 2) && (leapYear == 0) && (day > 28) || (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 30)) || (((month == 1) || (month == 3) || (month == 5) || (month == 7)|| (month == 8) || (month == 10) || (month == 12)) && (day > 31))))){
            System.out.println("Такой даты нет");
        } else if (day == 31 && month == 12) {
            int nextDay = 1;
            int nextMonth = 1;
            int nextYear = year + 1;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, nextYear);
        } else if (day == 31) {
            int nextDay = 1;
            int nextMonth = month + 1;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, year);
        } else if (day == 30 && ((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
            int nextDay = 1;
            int nextMonth = month + 1;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, year);
        } else if (day == 29 && month == 2) {
            int nextDay = 1;
            int nextMonth = 3;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, year);
        } else if (day == 28 && leapYear == 0) {
            int nextDay = 1;
            int nextMonth = 3;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, year);
        } else {
            int nextDay = day + 1;
            int nextMonth = month + 1;
            System.out.printf("Завтра будет %d.%d.%d г.", nextDay, nextMonth, year);
        }

        //System.out.printf("Завтра будет %d,.%d.%d г.", nextDay, nextMonth, nextYear);
    }
}
