package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.Balance;

import java.util.List;

public interface BalanceService {
    public Balance createBalance(Balance balance);

    public List<Balance> getBalanceList();

    public Balance getBalanceById(int id);

    public Balance updateBalance(Balance newBalance, int id);

    public void deleteBalanceById(int id);
}
