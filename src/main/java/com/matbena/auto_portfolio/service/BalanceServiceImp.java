package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.Balance;
import com.matbena.auto_portfolio.repository.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BalanceServiceImp implements BalanceService{
    @Autowired
    private BalanceRepository balanceRepository;

    @Override
    public Balance createBalance(Balance balanceType) {
        return balanceRepository.save(balanceType);
    }

    @Override
    public List<Balance> getBalanceList() {
        return balanceRepository.findAll();
    }

    @Override
    public Balance getBalanceById(int id) {
        return balanceRepository.findById(id).orElse(null);
    }

    @Override
    public Balance updateBalance(Balance newBalance, int id) {
        Balance updateBalance = balanceRepository.findById(id).orElse(null);

        assert updateBalance != null;
        updateBalance.setBudgetARS(newBalance.getBudgetARS());
        updateBalance.setBudgetUSD(newBalance.getBudgetUSD());
        updateBalance.setDailyVariation(newBalance.getDailyVariation());

        return balanceRepository.save(updateBalance);
    }

    @Override
    public void deleteBalanceById(int id) {
        balanceRepository.deleteById(id);
    }
}