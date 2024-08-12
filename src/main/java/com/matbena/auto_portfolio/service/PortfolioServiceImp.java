package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.Portfolio;
import com.matbena.auto_portfolio.model.PortfolioId;
import com.matbena.auto_portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PortfolioServiceImp implements PortfolioService{
    @Autowired
    private PortfolioRepository portfolioRepository;

    @Override
    public Portfolio createPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Override
    public List<Portfolio> getPortfolioList() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio getPortfolioById(PortfolioId id) {
        return portfolioRepository.findById(id).orElse(null);
    }

    @Override
    public Portfolio updatePortfolio(Portfolio newPortfolio, PortfolioId id) {
        Portfolio updatePortfolio = portfolioRepository.findById(id).orElse(null);

        assert updatePortfolio != null;
        updatePortfolio.setAsset(newPortfolio.getAsset());
        updatePortfolio.setPercentage(newPortfolio.getPercentage());

        return portfolioRepository.save(updatePortfolio);
    }

    @Override
    public void deletePortfolioById(PortfolioId id) {
        portfolioRepository.deleteById(id);
    }
}
