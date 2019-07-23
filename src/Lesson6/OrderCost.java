package Lesson6;

import java.util.Scanner;

public class OrderCost {
    private static int getDiscountProductsQuantity(double totalQuantity) {
        return (totalQuantity >= 10) ? 5 : 0;
    }

    private static int getDiscountProductsCoast(double totalCoast) {
        return (totalCoast >= 1000) ? 5 : 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите количество товаров А");
        int productAQuantity = s.nextInt();

        System.out.println("Введите количество товаров Б");
        int productBQuantity = s.nextInt();

        double productAPrice = 200;
        double productBPrice = 100;

        int totalQuantity = productAQuantity + productBQuantity;

        double totalCoast = productAPrice * productAQuantity + productBPrice * productBQuantity;

        int totalDiscount = getDiscountProductsQuantity (totalQuantity) + getDiscountProductsCoast(totalCoast);

        double orderCost = totalCoast - totalCoast * totalDiscount / 100;

        System.out.printf("Итоговая стоимость всех товаров составляет %.2f р. c учетом скидки %d %%", orderCost, totalDiscount);
    }
}



