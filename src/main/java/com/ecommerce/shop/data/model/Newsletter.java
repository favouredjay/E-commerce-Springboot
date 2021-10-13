package com.ecommerce.shop.data.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Newsletter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String subscriberEmail;
}
