package Lesson12;

public class BreakString {
    public static void main(String[] args) {
        String stringWithNumber = "1, 2, 3, 4, 5";

        System.out.println("Сумма цифр в строке = " + getSum(stringWithNumber));
    }

    private static int getSum(String stringWithNumber) {
        String[] numbers = stringWithNumber.split(", ");

        int[] numbersArray = new int[numbers.length];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(numbers[i]);
        }

        int sum = 0;

        for (int e : numbersArray) {
            sum += e;
        }

        return sum;
    }
}
