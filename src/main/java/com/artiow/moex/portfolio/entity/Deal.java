package com.artiow.moex.portfolio.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Deal {

    private BigDecimal price;
    private String currency;
    private Integer amount;
    private BigDecimal volume;
    private DealDirection direction;
    private LocalDateTime datetime;
}
