package com.ijse.possystembackend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDTO {

    private String name;

    private Double price;

    private Integer qty;

    private Long categoryId;
}
