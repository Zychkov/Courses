package Lesson11;

public class QuickSort {
    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;

        int x = (i + j) / 2;

        while (i < j) {
            while (i < x && (array[i] <= array[x])) {
                i++;
            }

            while (j > x && (array[x] <= array[j])) {
                j--;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            if (i == x) {
                x = j;
            } else if (j == x) {
                x = i;
            }
        }

        quickSort(array, left, x);
        quickSort(array, x + 1, right);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 21, 10, 12, 4};

        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);

        for (int e : array) {
            System.out.println(e);
        }
    }
}