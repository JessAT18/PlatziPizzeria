package com.jessat.pizza.service.dto;

import lombok.Data;

@Data
public class UpdatePizzaPriceDto {
    private Integer pizzaId;
    private Double newPrice;
}
