package com.shf.sy7.dao;

import com.shf.sy7.pojo.Bank;

import java.util.List;


public interface BankDao {
    Bank Deposit(Bank bankFrom, Bank bankTo, Double money);
    Bank Withdraw(Bank bankFrom, Bank bankTo, Double money);
    List<Bank> Transfer(Bank bankFrom, Bank bankTo, Double money);
}
