package Coursework;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("   | ");

        for (int i = 1; i <= 10; i++){
            System.out.printf("%3d ", i);
        }

        System.out.println("\n---|----------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);

            for (int k = 1; k <= 10; k++) {
                System.out.printf("%4d", k * i);
            }
            System.out.println();
        }
    }
}
