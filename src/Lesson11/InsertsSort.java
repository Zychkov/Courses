package Lesson11;

public class InsertsSort {
    private static int[] getSortingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < array[j]) {           //сделал условие немного наоборот, чем указано в лекции, т.к. возникает варнинг
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }

            array[j + 1] = temp;
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

