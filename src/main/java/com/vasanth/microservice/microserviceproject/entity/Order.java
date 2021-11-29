package com.vasanth.microservice.microserviceproject.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Order implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "purch_amt")
    private int purchaseAmt;


    @ManyToMany
    @JoinColumn(name = "person_id")
    private Person person;


    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getPurchaseAmt() {
        return purchaseAmt;
    }

    public void setPurchaseAmt(int purchaseAmt) {
        this.purchaseAmt = purchaseAmt;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
