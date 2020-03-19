package com.artiow.moex.portfolio.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
public abstract class AbstractDocument implements Document {

    @Id
    private String id;

    public boolean isNew() {
        return id == null;
    }
}
