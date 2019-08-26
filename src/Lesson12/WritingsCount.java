package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WritingsCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для которого хотите посчитать количество вхождений:");
        String findText = scanner.nextLine();

        int writingsCount = 0;

        try (Scanner scannerFile = new Scanner(new FileInputStream("src/Lesson12/inputText.txt"), "windows-1251")) {
            while (scannerFile.hasNextLine()) {
                String text = scannerFile.nextLine();

                writingsCount += getWritingsCount(text, findText);
            }
        }

        System.out.println("Количество вхождений = " + writingsCount);
    }

    private static int getWritingsCount(String text, String findText) {
        text = text.toLowerCase();
        findText = findText.toLowerCase();

        int writingsCount = 0;
        int startIndex = 0;
        int index;

        do {
            index = text.indexOf(findText, startIndex);

            if (index != -1) {
                writingsCount++;
            }

            startIndex = index + findText.length();
        } while (index != -1);

        return writingsCount;
    }
}

