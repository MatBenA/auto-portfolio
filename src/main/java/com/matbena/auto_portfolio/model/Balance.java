package com.matbena.auto_portfolio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private LocalDateTime dateTime;
    private BigDecimal budgetARS;
    private BigDecimal budgetUSD;
    private float dailyVariation;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
