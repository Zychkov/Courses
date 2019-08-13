package Lesson11;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean isSorted = true;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 14, 7, 21};

        bubbleSort(array);

        for (int e : array) {
            System.out.println(e);
        }
    }
}

