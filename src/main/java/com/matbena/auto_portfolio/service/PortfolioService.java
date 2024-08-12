package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.Portfolio;
import com.matbena.auto_portfolio.model.PortfolioId;

import java.util.List;

public interface PortfolioService {
    public Portfolio createPortfolio(Portfolio portfolio);

    public List<Portfolio> getPortfolioList();

    public Portfolio getPortfolioById(PortfolioId id);

    public Portfolio updatePortfolio(Portfolio newPortfolio, PortfolioId id);

    public void deletePortfolioById(PortfolioId id);
}
