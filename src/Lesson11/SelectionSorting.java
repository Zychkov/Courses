package Lesson11;

public class SelectionSorting {
    private static void getSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 21, 4, 14, 5, 3};

        getSelectionSort(array);

        for (int e : array) {
            System.out.println(e);
        }
    }
}

/*
1. Общие замечания +
2. SortingSelection - тут между словами нужен предлог (SortingBySelection) либо обратный порядок слов (SelectionSorting) +
3. Можно обойтись без minNumber, но можно оставить как есть +
4. Можно уменьшить количество итераций внешнего цикла +
5. Здесь не нужен if при обмене +
6. В данном случае можно сделать обмен меньшим количеством действий
 */