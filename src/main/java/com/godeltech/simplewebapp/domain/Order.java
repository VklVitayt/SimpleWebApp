package com.godeltech.simplewebapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    @Column(name = "order_description")
    private String orderDescription;

    @Column(name = "price_order")
    @NonNull
    private Long priceOrder;

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Long getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(Long priceOrder) {
        this.priceOrder = priceOrder;
    }
}
