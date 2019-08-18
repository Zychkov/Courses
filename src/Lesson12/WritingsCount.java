package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WritingsCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        String text = null;

        try (Scanner scannerFile = new Scanner(new FileInputStream("src/Lesson12/inputText.txt"), "windows-1251")) {
            while (scannerFile.hasNextLine()) {
                text = scannerFile.nextLine();
            }
        }

        System.out.println("Введите текст для которого хотите посчитать количество вхождений:");
        String findText = scanner.nextLine();

        System.out.println(text);
        System.out.println(findText);

        int writingsCount = getWritingsCount(text, findText);

        System.out.println("Количество вхождений = " + writingsCount);
    }

    private static int getWritingsCount(String text, String findText) {
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
    }
}