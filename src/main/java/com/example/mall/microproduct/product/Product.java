package com.example.mall.microproduct.product;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Product {

    @Id
    private Integer id;
    private BigDecimal price;
    private String unit;
    private Integer totalAmount;
    private String imgUrl;
    private String name;


    public boolean isOutOfAmount(Integer amount) {
        return totalAmount.compareTo(amount) < 0;
    }
}
