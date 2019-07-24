package Lesson6;

import java.util.Scanner;

public class OrderCost {
    private static int getDiscountProductsQuantity(double totalQuantity) {
        int discount = 5;
        return (totalQuantity >= 10) ? discount : 0;
    }

    private static int getDiscountProductsCoast(double totalCoast) {
        return (totalCoast >= 1000) ? 5 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товаров А");
        int productAQuantity = scanner.nextInt();

        System.out.println("Введите количество товаров Б");
        int productBQuantity = scanner.nextInt();

        double productAPrice = 200;
        double productBPrice = 100;

        int totalQuantity = productAQuantity + productBQuantity;

        double totalCoast = productAPrice * productAQuantity + productBPrice * productBQuantity;

        int totalDiscount = getDiscountProductsQuantity(totalQuantity) + getDiscountProductsCoast(totalCoast);

        double orderCost = totalCoast - totalCoast * totalDiscount / 100;

        System.out.printf("Итоговая стоимость всех товаров составляет %.2f р. c учетом скидки %d %%", orderCost, totalDiscount);
    }
}



