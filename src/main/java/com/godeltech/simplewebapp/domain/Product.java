package com.godeltech.simplewebapp.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "furniture_type")
    @NonNull
    private String furnitureType;

    @Column(name = "title")
    @NonNull
    private String title;

    @Column(name = "count")
    @NonNull
    private Integer count;

    @Column(name = "price")
    @NonNull
    private Integer price;
}
