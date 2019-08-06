package Lesson11;

public class SortingSelection {
    private static int[] getSortingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minNumber = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minNumber) {
                    minNumber = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {12, 21, 3, 14, 4, 4};

        for (int e : getSortingArray(array)) {
            System.out.println(e);
        }
    }

}
