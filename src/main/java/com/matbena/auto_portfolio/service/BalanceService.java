package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.DailyBalance;

import java.util.List;

public interface BalanceService {
    public DailyBalance createBalance(DailyBalance dailyBalance);

    public List<DailyBalance> getBalanceList();

    public DailyBalance getBalanceById(int id);

    public DailyBalance updateBalance(DailyBalance newDailyBalance, int id);

    public void deleteBalanceById(int id);
}
