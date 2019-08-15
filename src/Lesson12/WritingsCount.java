package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WritingsCount {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("src/Lesson12/inputText.txt"), "windows-1251")) {
            String text = null;

            while (scanner.hasNextLine()) {
                text = scanner.nextLine();
            }

            System.out.println("Введите текст, который хотите посчитать");
            String findText = scanner.nextLine();

            System.out.println(text);
            //System.out.println("Количество вхождений текста: " + findText + " в строку = " + getWritingsCount(text, findText));

        }
    }

    /*private static int getWritingsCount(String text, String findText) {
        int writingsCount = 0;

        int startIndex = 0;
        int index = 0;

        while (index != -1) {
            index = text.indexOf(findText, startIndex);

            if (index > 0) {
                writingsCount++;
            }

            startIndex = index + findText.length();
        }

        return writingsCount;
    }*/
}