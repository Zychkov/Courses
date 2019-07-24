package Lesson6;

import java.util.Scanner;

public class TemperatureTranslation {
    private static double getKelvinDegree (double degree) {
        return degree - 273.15;
    }

    private static double getFahrenheitDegree (double degree) {
        return (degree * 1.8 + 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите градусы Цельсия: ");
        double degree = scanner.nextInt();

        System.out.printf("В градусах Кельвина = %.0f K%n", getKelvinDegree(degree));
        System.out.printf("В градусах Фаренгейта = %.0f F", getFahrenheitDegree(degree));
    }
}
