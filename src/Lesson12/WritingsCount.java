package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WritingsCount {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("src/Lesson12/inputText.txt"), "windows-1251")) {
            int writingsCount = 0;
            while (scanner.hasNextLine()) {
                int startIndex = 0;
                int index = 0;

                while (index >= 0) {
                    index = scanner.nextLine().indexOf("е", startIndex);

                    if (index > 0) {
                        writingsCount++;
                    }

                    startIndex = index;
                }
            }

            System.out.println("Количество вхождений = " + writingsCount);
        }
    }
}
