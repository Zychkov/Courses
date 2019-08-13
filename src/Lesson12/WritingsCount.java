package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WritingsCount {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("src/Lesson12/inputText.txt"), "windows-1251")) {
            String[] fileString = new String[50];

            int i = 0;

            while (scanner.hasNextLine()) {
                fileString[i] = scanner.nextLine().toLowerCase();

                i++;
            }

            String[] copyFileString = new String[i];

            System.arraycopy(fileString, 0, copyFileString, 0, i);

            StringBuilder preparedString = new StringBuilder();

            for (String e : copyFileString) {
                preparedString.append(e).append(" ");
            }

            int writingsCount = 0;
            int startIndex = 0;
            int index = 0;

            /*System.out.println("Введите текст, который котите посчитать:");
            String textForCount = scanner.nextLine().toLowerCase();*/

            while (index >= 0) {
                index = preparedString.indexOf("е", startIndex);

                if (index > 0) {
                    writingsCount++;
                }

                startIndex = index;
            }

            System.out.println("Количество вхождений = " + writingsCount);
        }
    }
}
