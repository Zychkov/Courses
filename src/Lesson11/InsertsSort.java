package Lesson11;

public class InsertsSort {
    private static int[] getSortingArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            for (int j = i - 1; j > 0; j--) {
                if (j < 0 || temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                }

                array[j + 1] = array[j];
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

/*
int[] array = {10, 2, 10, 3, 1, 2, 5};
System.out.println(Arrays.toString(array));
for (int left = 0; left < array.length; left++) {
	// Вытаскиваем значение элемента
	int value = array[left];
	// Перемещаемся по элементам, которые перед вытащенным элементом
	int i = left - 1;
	for (; i >= 0; i--) {
		// Если вытащили значение меньшее — передвигаем больший элемент дальше
		if (value < array[i]) {
			array[i + 1] = array[i];
		} else {
			// Если вытащенный элемент больше — останавливаемся
			break;
		}
	}
	// В освободившееся место вставляем вытащенное значение
	array[i + 1] = value;
}
System.out.println(Arrays.toString(array));
 */