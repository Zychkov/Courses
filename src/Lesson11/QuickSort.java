package Lesson11;

public class QuickSort {
    private static int[] getSortingArray(int[] array, int left, int right) {
        int temp;
        int x = 10;

        int i = left;
        int j = right;

        for (; array[i] < x; i++) {
            for (; array[j] > x; j--) {
                if (i <= j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                    break;
                } else {
                    break;
                }
            }
        }

        if (i < right) {
            getSortingArray(array, i, right);
        }
        if (j < left) {
            getSortingArray(array, left, j);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 21, 10, 12, 4};

        int left = 0;
        int right = array.length;

        for (int e : getSortingArray(array, left, right)) {
            System.out.println(e);
        }
    }
}

/*
public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
}
 */
