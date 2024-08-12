package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.DailyBalance;
import com.matbena.auto_portfolio.repository.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceServiceImp implements BalanceService{
    @Autowired
    private BalanceRepository balanceRepository;

    @Override
    public DailyBalance createBalance(DailyBalance dailyBalanceType) {
        return balanceRepository.save(dailyBalanceType);
    }

    @Override
    public List<DailyBalance> getBalanceList() {
        return balanceRepository.findAll();
    }

    @Override
    public DailyBalance getBalanceById(int id) {
        return balanceRepository.findById(id).orElse(null);
    }

    @Override
    public DailyBalance updateBalance(DailyBalance newDailyBalance, int id) {
        DailyBalance updateDailyBalance = balanceRepository.findById(id).orElse(null);

        assert updateDailyBalance != null;
        updateDailyBalance.setVariationArs(newDailyBalance.getVariationArs());
        updateDailyBalance.setVariationUsd(newDailyBalance.getVariationUsd());

        return balanceRepository.save(updateDailyBalance);
    }

    @Override
    public void deleteBalanceById(int id) {
        balanceRepository.deleteById(id);
    }
}