package com.matbena.auto_portfolio.repository;

import com.matbena.auto_portfolio.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<Balance, Integer> {
}
