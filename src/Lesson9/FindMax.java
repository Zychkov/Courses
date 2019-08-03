package Lesson9;
//Написать функцию, которая ищет максимальное число в массиве вещественных чисел

public class FindMax {
    private static double getMaxNumberInArray(double[] array) {
        double maxNumber = array [0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        double[] array = {4, 10, 17, 20, 5, 7};

        System.out.println("Максимальное число в массиве " + getMaxNumberInArray(array));
    }
}
