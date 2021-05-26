package entities;

import entiteis.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private Date Moment;
    private OrderStatus orderStatus;

    public Order(){
    }

    public Order(Integer id, Date moment, OrderStatus orderStatus) {
        this.id = id;
        Moment = moment;
        this.orderStatus = orderStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return Moment;
    }

    public void setMoment(Date moment) {
        Moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", Moment=" + Moment +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
