package Lesson11;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        isSorted = false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 10, 8, 14, 7, 21};

        bubbleSort(array);

        for (int e : array) {
            System.out.println(e);
        }
    }
}


/*
1. Общие замечания +
2. Нужно ещё реализовать оптимизацию - прекращение сортировки если массив уже отсортирован +
 */
