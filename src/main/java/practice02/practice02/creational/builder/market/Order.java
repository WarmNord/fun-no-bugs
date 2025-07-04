package practice02.practice02.creational.builder.market;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> products = new ArrayList<>();
    private int discount;
    private String payment;

    public Order(Builder builder) {
        products = builder.products;
        discount = builder.discount;
        payment = builder.payment;
    }

    void print() {
        System.out.println(products + " " + discount + " " + payment);
    }

    static class Builder {
        private List<String> products = new ArrayList<>();
        private int discount;
        private String payment;

        public Builder setProduct(String product) {
            this.products.add(product);
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setPayment(String payment) {
            this.payment = payment;
            return this;
        }

        Order build() {
            return new Order(this);
        }
    }
}
