package Lesson6;

import java.util.Scanner;

public class TemperatureConvertation {
    private static double getKelvinDegree(double celsiusDegree) {
        return celsiusDegree + 273.15;
    }

    private static double getFahrenheitDegree(double celsiusDegree) {
        return celsiusDegree * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите градусы Цельсия: ");
        double celsiusDegree = scanner.nextDouble();

        System.out.printf("В градусах Кельвина = %.2f K%n", getKelvinDegree(celsiusDegree));
        System.out.printf("В градусах Фаренгейта = %.2f F", getFahrenheitDegree(celsiusDegree));
    }
}
