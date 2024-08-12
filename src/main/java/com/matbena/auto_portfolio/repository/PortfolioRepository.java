package com.matbena.auto_portfolio.repository;

import com.matbena.auto_portfolio.model.Portfolio;
import com.matbena.auto_portfolio.model.PortfolioId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, PortfolioId> {
}
