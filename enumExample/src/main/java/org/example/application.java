package org.example;

import entiteis.enums.OrderStatus;
import entities.Order;

import java.util.Date;

public class application {
    public static void main(String[] args) {

        Order order01 = new Order(001, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order01);

        OrderStatus os01 = OrderStatus.DELIVERED;
        OrderStatus os02 = OrderStatus.valueOf("PROCESSING");
        System.out.println(os01);
        System.out.println(os02);



    }
}
