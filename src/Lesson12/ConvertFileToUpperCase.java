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

            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}