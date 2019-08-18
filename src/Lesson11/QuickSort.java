package Lesson11;

public class QuickSort {
    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;

        int x = (left + right) / 2;

        while (array[i] < array[x]) {
            i++;
        }

        while (array[j] > array[x]) {
            j--;
        }

        if (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        if (i < right) {
            quickSort(array, i, right);
        }

        if (j > left) {
            quickSort(array, left, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 0, 4, 7, 16, 7, 10, 12, 3};

        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);

        for (int e : array) {
            System.out.println(e);
        }
    }
}

