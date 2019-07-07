package Lesson1;

public class SquareRoot {
    public static void main(String[] args) {
        int a = 16;
        int b = 9;
        int c = 4;

        double a1 = Math.sqrt(a);
        double b1 = Math.sqrt(b);
        double c1 = Math.sqrt(c);
        int y = b % c;

        System.out.println("Корень числа \"а\" равен " + a1);
        System.out.println("Корень числа \"b\" равен " + b1);
        System.out.println("Корень числа \"c\" равен " + c1);
        System.out.println(y);
    }
}
