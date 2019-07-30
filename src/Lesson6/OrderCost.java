package Lesson6;

import java.util.Scanner;

public class OrderCost {
    private static int getDiscountForProductsQuantity(double totalQuantity) {
        final int discount = 5;
        final int productsForDiscount = 10;

        return (totalQuantity >= productsForDiscount) ? discount : 0;
    }

    private static int getDiscountForProductsCost(double totalPrice) {
        final int discount = 5;
        final int productsPriceForDiscount = 1000;

        return (totalPrice >= productsPriceForDiscount) ? discount : 0;
    }

    private static double getOrderValue(int productAQuantity, int productBQuantity, double productAPrice, double productBPrice) {
        final int percentToDecimal = 100;

        int totalQuantity = productAQuantity + productBQuantity;

        double totalPrice = productAPrice * productAQuantity + productBPrice * productBQuantity;

        int totalDiscount = getDiscountForProductsQuantity(totalQuantity) + getDiscountForProductsCost(totalPrice);

        return totalPrice - totalPrice * totalDiscount / percentToDecimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товаров А");
        int productAQuantity = scanner.nextInt();

        System.out.println("Введите стоимость товара А");
        double productAPrice = scanner.nextDouble();

        System.out.println("Введите количество товаров Б");
        int productBQuantity = scanner.nextInt();

        System.out.println("Введите стоимость товара Б");
        double productBPrice = scanner.nextDouble();

        System.out.printf("Итоговая стоимость всех товаров составляет %.2f р.", getOrderValue(productAQuantity, productBQuantity, productAPrice, productBPrice));
    }
}



