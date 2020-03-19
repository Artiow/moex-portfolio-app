package com.artiow.moex.portfolio.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document("positions")
public class PositionDocument extends AbstractDocument {

    private String secid;
    private Boolean isOpen;
    private List<Deal> deals;
}
