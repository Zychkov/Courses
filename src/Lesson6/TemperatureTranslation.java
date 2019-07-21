package Lesson6;

import java.util.Scanner;

public class TemperatureTranslation {
    private static int getKelvinDegree (int degree) {
        return degree + 273;
    }

    private static double getFahrenheitDegree (int degree) {
        return (degree * 1.8 - 459);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите градусы Цельсия: ");
        int degree = s.nextInt();

        System.out.printf("В градусах Кельвина = %d K%n", getKelvinDegree(degree));
        System.out.printf("В градусах Фаренгейта = %.0f F", getFahrenheitDegree(degree));
    }
}
