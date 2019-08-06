package Lesson11;

public class BubbleSort {
    private static int[] getSortingArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 21, 14, 12, 4};

        for (int e : getSortingArray(array)) {
            System.out.println(e);
        }
    }

}
