package Lesson12;
//Написать программу, которая читает строки файла, переводит их в верхний регистр и записывает результат во второй файл

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConvertFileToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("src/Lesson12/output.txt");
             Scanner scanner = new Scanner(new FileInputStream("src/Lesson12/input.txt"), "windows-1251")) {
            int count = scanner.nextInt();

            String[] arrayToLowerCase = new String[count];

            /*for (int i = 0; i < count; i++) {
                arrayToLowerCase[i] = scanner.nextLine().toUpperCase();
            }*/

            int i = 0;

            while (scanner.hasNextLine()) {
                arrayToLowerCase[i] = scanner.nextLine().toUpperCase();

                i++;
            }
/*
            String[] finishStringArray = new String[i];

            System.arraycopy(arrayToLowerCase, 0, finishStringArray, 0, i);
*/
            for (String e : arrayToLowerCase) {
                writer.println(e);
            }
        }
    }
}


/*
Перевод файла в верх. регистр:
1. Нужно обработать весь файл. В файле может быть больше 10 строк.
Сейчас если в файле будет больше 10 строк, то программа упадет
2. В целом лучше обрабатывать файл построчно
*/