package com.matbena.auto_portfolio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "user_account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private BigDecimal budget;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<DailyBalance> dailyBalanceList;

    @OneToMany(mappedBy = "user")
    private List<Portfolio> portfolioList;
}