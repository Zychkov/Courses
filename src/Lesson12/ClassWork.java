package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            //int count = scanner.nextInt();

            double[] array = new double[10];

            int i = 0;

            while (scanner.hasNextDouble()) {
                if (i >= array.length){
                    double[] copy = new double[array.length * 2];
                    for (int j = 0; j < array.length; j++){

                    }
                }
                array[i] = scanner.nextDouble();
                i++;
            }
            /*
            for (int i = 0; i < count; ++i) {
                array[i] = scanner.nextDouble();
            }
            */

            double[] result = new double[i];
            for(int j = 0; j < result.length; j++) {
                result[j] = array[j];
            }
            System.out.println(Arrays.toString(result));
        }
    }
}
