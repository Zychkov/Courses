package Lesson12;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите URL");
        String stringURL = scanner.nextLine();

        System.out.println("Имя сервера: " + getServerName(stringURL));
    }

    private static String getServerName(String stringURL) {
        String serverName = null;


        int firstIndexServerName = stringURL.indexOf("://");

        if (firstIndexServerName != -1) {
            int lastIndexServerName = stringURL.indexOf("/", firstIndexServerName + 3);

            if (lastIndexServerName == -1) {
                serverName = stringURL.substring(firstIndexServerName + 3);
            } else {
                serverName = stringURL.substring(firstIndexServerName + 3, lastIndexServerName);
            }
        }

        return serverName;
    }
}

// http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf
