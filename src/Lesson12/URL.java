package Lesson12;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите URL");
        String stringURL = scanner.nextLine();

        System.out.println(getServerName(stringURL));
    }

    private static String getServerName(String stringURL) {
        if (stringURL.contains("://")) {
            int firstIndexServerName = stringURL.indexOf("://");
            int lastIndexServerName = stringURL.indexOf("/", firstIndexServerName + 3);

            String serverName = "";

            if (lastIndexServerName == -1) {
                serverName = stringURL.substring(firstIndexServerName + 3);
            } else {
                serverName = stringURL.substring(firstIndexServerName + 3, lastIndexServerName);
            }

            return serverName;
        }

        return "Error, server name not found";
    }
}


/*
http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf
 */