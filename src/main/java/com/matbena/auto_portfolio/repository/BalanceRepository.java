package com.matbena.auto_portfolio.repository;

import com.matbena.auto_portfolio.model.DailyBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends JpaRepository<DailyBalance, Integer> {
}
