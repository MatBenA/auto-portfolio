package com.matbena.auto_portfolio.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class DailyBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @CreationTimestamp
    private LocalDateTime dateTime;

    private BigDecimal variationArs;
    private BigDecimal variationUsd;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}