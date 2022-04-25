package com.shf.sy7.test;

import com.shf.sy7.dao.BankDao;
import com.shf.sy7.pojo.Bank;
import com.shf.sy7.service.BankService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class BankTest {
    @Test
    public void bankTest1(){
        Bank zhangsanBank = new Bank(1, "zhangsan", 10000.0);
        Bank lisiBank = new Bank(2, "lisi",  20000.0);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BankService bankService = (BankService) context.getBean("BankService");

        bankService.Deposit(zhangsanBank, null,1000.0);

        bankService.Withdraw(lisiBank,null,200.0);

        bankService.Transfer(zhangsanBank,lisiBank,5000.0);

        bankService.Withdraw(zhangsanBank, null,10000.0);
    }
}
