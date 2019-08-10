package Lesson12;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder userString = new StringBuilder();
        int maxNumber = 100;

        for (int i = 1; i < maxNumber; i++) {
            userString.append(i);
            userString.append(", ");
        }

        userString.append(maxNumber);

        String finalString = userString.toString();
        System.out.println(finalString);
    }
}