package Coursework;

public class MultiplicationTable {
    public static void main(String[] args) {
        int maxNumder = 12;

        System.out.print("   | ");

        for (int i = 1; i <= maxNumder; i++){
            System.out.printf("%3d ", i);
        }

        System.out.println();
        System.out.print("---|");

        for (int i = 1; i <= maxNumder; i++){
            System.out.print("----");
        }

        System.out.println();

        for (int i = 1; i <= maxNumder; i++) {
            System.out.printf("%2d |", i);

            for (int j = 1; j <= maxNumder; j++) {
                System.out.printf("%4d", j * i);
            }
            System.out.println();
        }
    }
}
