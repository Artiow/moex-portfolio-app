package com.artiow.moex.portfolio.controller;

import com.artiow.moex.portfolio.entity.Deal;
import com.artiow.moex.portfolio.service.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.noContent;

@RestController
@RequestMapping("/portfolio")
@RequiredArgsConstructor
public class PortfolioController {

    private final PortfolioService portfolioService;


    @PostMapping("/{secid}/deal")
    public ResponseEntity<Void> addDeal(@PathVariable String secid, @RequestBody Deal deal) {
        portfolioService.addDeal(secid, deal);
        return noContent().build();
    }
}
