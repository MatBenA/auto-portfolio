package com.matbena.auto_portfolio.repository;

import com.matbena.auto_portfolio.model.Portfolio;
import com.matbena.auto_portfolio.model.PortfolioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, PortfolioId> {
}
