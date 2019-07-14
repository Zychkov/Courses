package Lesson4;

public class Cycle {
    public static void main(String[] args) {
        int i = 3;
        int evenSum = 0;
        int count = 0;

        while (i <= 21) {
            if (i % 2 == 0) {
                evenSum += i;
                ++count;
                System.out.printf("Sum = %d, i = %d, k = %d %n", evenSum, i, count);
            }

            ++i;
        }
        System.out.printf("Сумма равна %d, выполнено %d циклов, количество четных чисел %d", evenSum, i, count);
    }
}