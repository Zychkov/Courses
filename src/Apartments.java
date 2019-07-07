import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int apartmentOnFloor = 4;
        System.out.println("Введите количество этажей: ");
        int floorsQuantity = scanner.nextInt();
        System.out.println("Введите количество подъездов: ");
        int porchesQuantity = scanner.nextInt();
        System.out.println("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        if (apartmentNumber > (floorsQuantity * porchesQuantity * apartmentOnFloor)) {
            System.out.println("Такой квартиры в этом доме нет");
        } else if (floorsQuantity <= 0 || porchesQuantity <= 0 || apartmentNumber <= 0) {
            System.out.println("Введите корректные данные");
        } else {
            System.out.printf("Квартира находится в %.0f подъезде, ", Math.ceil((double)apartmentNumber / (floorsQuantity * apartmentOnFloor)));

            double floor = Math.ceil(((double)apartmentNumber % (floorsQuantity * apartmentOnFloor)) / apartmentOnFloor);
            if (floor == 0) {
                System.out.printf(" на %d этаже, ", floorsQuantity);
            } else {
                System.out.printf(" на %.0f этаже, ", floor);
            }

            if (apartmentNumber % apartmentOnFloor == 1) {
                System.out.println("ближняя слева.");
            } else if (apartmentNumber % apartmentOnFloor == 2) {
                System.out.println("дальняя слева.");
            } else if (apartmentNumber % apartmentOnFloor == 3) {
                System.out.println("дальняя права.");
            } else {
                System.out.println("ближняя права.");
            }
        }
    }
}