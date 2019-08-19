package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WritingsCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();

        try (Scanner scannerFile = new Scanner(new FileInputStream("src/Lesson12/inputText.txt"), "windows-1251")) {
            while (scannerFile.hasNextLine()) {
                text.append(scannerFile.nextLine().toLowerCase()).append(" ");
            }
        }

        String finalText = text.toString();

        System.out.println("Введите текст для которого хотите посчитать количество вхождений:");
        String findText = scanner.nextLine().toLowerCase();

        int writingsCount = getWritingsCount(finalText, findText);

        System.out.println("Количество вхождений = " + writingsCount);
    }

    private static int getWritingsCount(String finalText, String findText) {
        int writingsCount = 0;

        int startIndex = 0;
        int index;

        do {
            index = finalText.indexOf(findText, startIndex);

            if (index != -1) {
                writingsCount++;
            }

            startIndex = index + findText.length();
        } while (index != -1 && index < finalText.length());

        return writingsCount;
    }
}