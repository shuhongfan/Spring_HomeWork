package com.shf.sy7.dao;

import com.shf.sy7.pojo.Bank;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("BankDao")
public class BankDaoImpl implements BankDao {

    @Override
    public Bank Deposit(Bank bankFrom, Bank bankTo, Double money) {
        bankFrom.setBalance(bankFrom.getBalance()+money);
        return bankFrom;
    }

    @Override
    public Bank Withdraw(Bank bankFrom, Bank bankTo, Double money) {
        bankFrom.setBalance(bankFrom.getBalance()-money);
        return bankFrom;
    }

    @Override
    public List<Bank> Transfer(Bank bankFrom, Bank bankTo, Double money) {
        bankFrom.setBalance(bankFrom.getBalance()-money);
        bankTo.setBalance(bankTo.getBalance()+money);
        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(bankFrom);
        banks.add(bankTo);
        return banks;
    }
}
