package com.artiow.moex.portfolio.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("positions")
public class PositionDocument extends AbstractDocument {

    private String secid;
    private Integer amount;
    private Boolean isOpen;
    private List<Deal> deals;
}
