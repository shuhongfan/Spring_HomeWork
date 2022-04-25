package com.shf.sy7.service;

import com.shf.sy7.pojo.Bank;

import java.util.List;

public interface BankService {
    Bank Deposit(Bank bankFrom, Bank bankTo, Double money);
    Bank Withdraw(Bank bankFrom, Bank bankTo, Double money);
    List<Bank> Transfer(Bank bankFrom, Bank bankTo, Double money);
}
