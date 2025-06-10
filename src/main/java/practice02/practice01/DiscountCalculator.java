package practice02.practice01;

/*Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код

Исходный код:*/
public class DiscountCalculator {

    /*
    *         double discount = 0.0;

        if (isLoyalCustomer) {
            if (isFirstPurchase) {
                discount = price * 0.10;
            } else {
                discount = price * 0.05;
            }
        } else {
            if (hasCoupon) {
                discount = price * 0.07;
            } else {
                discount = price * 0.02;
            }
        }
        return price - discount;
    }
    * */

    private double applyLoyalCustomer(double price, boolean isLoyalCustomer, boolean isFirstPurchase) {
        double discounPrice = 0;
        if (isLoyalCustomer) {
            if (isFirstPurchase) {
                discounPrice = price * 0.10;
            } else {
                discounPrice = price * 0.05;
            }
        }
        return discounPrice;
    }

    private double applyCoupon(double price, boolean hasCoupon) {
        double discounPrice = 0;
        if (hasCoupon) {
            discounPrice = price * 0.07;
        } else {
            discounPrice = price * 0.02;
        }
        return discounPrice;
    }

    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;

 /*       if (isLoyalCustomer && isFirstPurchase) {
            discount = price * 0.10;
        } else if (hasCoupon) {
            discount = price * 0.07;
        } else if (isLoyalCustomer) {
            discount = price * 0.05;
        } else if (!hasCoupon) {
            discount = price * 0.02;
        }*/


        return applyLoyalCustomer(price, isLoyalCustomer, isFirstPurchase) + applyCoupon(price, hasCoupon);
    }
}