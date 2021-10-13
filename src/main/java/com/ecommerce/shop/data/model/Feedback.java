package com.ecommerce.shop.data.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Feedback {
    @Id
    private int id;
    private String comment;
    private String rating;
}
