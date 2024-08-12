package com.matbena.auto_portfolio.controller;

import com.matbena.auto_portfolio.model.DailyBalance;
import com.matbena.auto_portfolio.service.BalanceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daily-balances")
public class DailyBalanceController {

    @Autowired
    BalanceServiceImp balanceService;

    @PostMapping("/create")
    public DailyBalance createBalance(@RequestBody DailyBalance dailyBalance){
        return balanceService.createBalance(dailyBalance);
    }

    @GetMapping("/{id}")
    public DailyBalance getBalanceById(@PathVariable int id){
        return balanceService.getBalanceById(id);
    }

    @GetMapping
    public List<DailyBalance> getBalanceList() {
        return balanceService.getBalanceList();
    }

    @PutMapping("/update/{id}")
    public DailyBalance updateBalance(@RequestBody DailyBalance newDailyBalance, @PathVariable int id){
        return balanceService.updateBalance(newDailyBalance, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBalance(@PathVariable int id){
        balanceService.deleteBalanceById(id);
        return "Balance deleted";
    }
}
