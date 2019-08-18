package Lesson11;

public class PyramidalSort {
    private static void pyramidalSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            siftHeap(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            siftHeap(array, i, 0);
        }
    }

    private static void siftHeap(int[] array, int n, int i) {
        int largestUnit = i;

        while (2 * largestUnit + 1 < n) {
            int indexFirstChild = 2 * largestUnit + 1;
            int indexSecondChild = 2 * largestUnit + 2;

            if (array[indexFirstChild] > array[largestUnit]) {
                largestUnit = indexFirstChild;
            }

            if (indexSecondChild < n && array[indexSecondChild] > array[largestUnit]) {
                largestUnit = indexSecondChild;
            }

            if (largestUnit != i) {
                int temp = array[i];
                array[i] = array[largestUnit];
                array[largestUnit] = temp;

                i = largestUnit;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 0, 4, -7, 16, 7, 10, 12, 3};

        pyramidalSort(array);

        for (int e : array) {
            System.out.println(e);
        }
    }
}
