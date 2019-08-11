package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            double[] numbers = new double[10];

            int i = 0;

            while (scanner.hasNextDouble()) {
                numbers[i] = scanner.nextDouble();
                i++;
            }

            double[] result = new double[i];
            for (int j = 0; j < result.length; j++) {
                result[j] = numbers[j];
            }
            System.out.println(Arrays.toString(result));
        }
    }
}