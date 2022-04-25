package com.shf.sy7.service;

import com.shf.sy7.dao.BankDao;
import com.shf.sy7.pojo.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shuho
 */
@Service("BankService")
public class BankServiceImpl implements BankService {
    @Autowired
    private BankDao bankDao;


    @Override
    public Bank Deposit(Bank bankFrom, Bank bankTo, Double money) {
        return bankDao.Deposit(bankFrom,null,money);
    }

    @Override
    public Bank Withdraw(Bank bankFrom, Bank bankTo, Double money) {
        return bankDao.Withdraw(bankFrom,null,money);
    }

    @Override
    public List<Bank> Transfer(Bank bankFrom, Bank bankTo, Double money) {
        return bankDao.Transfer(bankFrom, bankTo, money);
    }
}
