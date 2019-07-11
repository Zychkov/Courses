package Coursework;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int apartmentsOnFloorQuantity = 4;

        System.out.println("Введите количество этажей: ");
        int floorsQuantity = scanner.nextInt();

        System.out.println("Введите количество подъездов: ");
        int porchesQuantity = scanner.nextInt();

        System.out.println("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        if (apartmentNumber > (floorsQuantity * porchesQuantity * apartmentsOnFloorQuantity)) {
            System.out.println("Такой квартиры в этом доме нет");
        } else if ((floorsQuantity <= 0) || (porchesQuantity <= 0) || (apartmentNumber <= 0)) {
            System.out.println("Введите корректные данные");
        } else {
            int porchNumber = (int) Math.ceil((double) apartmentNumber / (floorsQuantity * apartmentsOnFloorQuantity));
            System.out.printf("Квартира находится в подъезде № %d, ", porchNumber);

            int floorNumber = (((apartmentNumber - 1) % (apartmentsOnFloorQuantity * floorsQuantity)) / apartmentsOnFloorQuantity) + 1;
            System.out.printf("на %d этаже, ", floorNumber);

            int doorPosition = apartmentNumber % apartmentsOnFloorQuantity;
            if (doorPosition == 1) {
                System.out.println("ближняя слева.");
            } else if (doorPosition == 2) {
                System.out.println("дальняя слева.");
            } else if (doorPosition == 3) {
                System.out.println("дальняя справа.");
            } else {
                System.out.println("ближняя справа.");
            }
        }
    }
}