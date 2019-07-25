package Lesson6;

import java.util.Scanner;

public class OrderCost {
    private static int getDiscountProductsQuantity(double totalQuantity) {
        int discount = 5;
        int productsForDiscount = 10;

        return (totalQuantity >= productsForDiscount) ? discount : 0;
    }

    private static int getDiscountProductsCoast(double totalPrice) {
        int discount = 5;
        int productsPriceForDiscount = 1000;

        return (totalPrice >= productsPriceForDiscount) ? discount : 0;
    }

    private static double getPriceCalc( int productAQuantity, int productBQuantity, double productAPrice, double productBPrice) {
        int percentToDecimal = 100;

        int totalQuantity = productAQuantity + productBQuantity;

        double totalPrice = productAPrice * productAQuantity + productBPrice * productBQuantity;

        int totalDiscount = getDiscountProductsQuantity(totalQuantity) + getDiscountProductsCoast(totalPrice);

        return totalPrice - totalPrice * totalDiscount / percentToDecimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товаров А");
        int productAQuantity = scanner.nextInt();

        System.out.println("Введите стоимость товара А");
        double productAPrice = scanner.nextInt();

        System.out.println("Введите количество товаров Б");
        int productBQuantity = scanner.nextInt();

        System.out.println("Введите стоимость товара Б");
        double productBPrice = scanner.nextInt();

        System.out.printf("Итоговая стоимость всех товаров составляет %.2f р.", getPriceCalc(productAQuantity, productBQuantity, productAPrice, productBPrice));
    }
}



