package com.artiow.moex.portfolio.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public abstract class AbstractDocument {

    @Id
    private String id;
}
