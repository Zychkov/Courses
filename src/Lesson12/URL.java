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

        int serverNameFirstIndex = stringURL.indexOf("://");

        if (serverNameFirstIndex != -1) {
            int serverNameLastIndex = stringURL.indexOf("/", serverNameFirstIndex + 3);

            if (serverNameLastIndex == -1) {
                serverName = stringURL.substring(serverNameFirstIndex + 3);
            } else {
                serverName = stringURL.substring(serverNameFirstIndex + 3, serverNameLastIndex);
            }
        }

        return serverName;
    }
}

// http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf
