package com.artiow.moex.portfolio.service;

import com.artiow.moex.portfolio.entity.Deal;
import com.artiow.moex.portfolio.entity.PositionDocument;
import com.artiow.moex.portfolio.repository.PositionRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static java.util.Optional.ofNullable;

@Service
@RequiredArgsConstructor
public class PortfolioService {

    private final PositionRepository positionRepository;


    public void addDeal(String secid, Deal deal) {
        val position = ofNullable(positionRepository.findBySecidAndIsOpenIsTrue(secid)).orElseGet(PositionDocument::new);
        if (position.isNew()) {
            position.setSecid(secid);
            position.setIsOpen(true);
            position.setDeals(new ArrayList<>(1));
        }
        position.getDeals().add(deal);
        positionRepository.save(position);
    }
}
