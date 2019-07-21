package Lesson6;

public class Overload {
    private static int getTypeSize (byte x) {
        return 1;
    }

    private static int getTypeSize (short x) {
        return 2;
    }

    private static int getTypeSize (int x) {
        return 4;
    }

    private static int getTypeSize (long x) {
        return 8;
    }

    private static int getTypeSize (float x) {
        return 4;
    }

    private static int getTypeSize (double x) {
        return 8;
    }

    public static void main(String[] args) {
        System.out.println("Количество байт, требуемых под переменную типа byte = " + getTypeSize((byte) 3));
        System.out.println("Количество байт, требуемых под переменную типа short = " + getTypeSize((short) 3));
        System.out.println("Количество байт, требуемых под переменную типа int = " + getTypeSize( 3));
        System.out.println("Количество байт, требуемых под переменную типа long = " + getTypeSize((long) 3));
        System.out.println("Количество байт, требуемых под переменную типа float = " + getTypeSize((float) 3));
        System.out.println("Количество байт, требуемых под переменную типа double = " + getTypeSize((double) 3));
    }
}
