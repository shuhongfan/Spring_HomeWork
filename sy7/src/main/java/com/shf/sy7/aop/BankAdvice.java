package com.shf.sy7.aop;

import com.shf.sy7.exception.MyException;
import com.shf.sy7.pojo.Bank;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class BankAdvice {
    //切点
    @Pointcut(value = "execution( * com.shf.sy7.dao.BankDaoImpl.*(..))")
    public void poincut(){
    }

    //前置通知  系统日志打印交易类型
    @Before(value = "poincut()&&args(from,to,mon)")
    public void before(JoinPoint joinPoint,Object from,Object to,Object mon) throws MyException {
        String name = joinPoint.getSignature().getName();
        Bank bankFrom= (Bank) from;
        Bank bankTo= (Bank) to;
        Double money = (Double) mon;
        System.out.println("*********************************************************");

//        判断余额是否充足
        if ((name=="Withdraw" || name=="Transfer") && (bankFrom.getBalance()-money<0)){
            throw new MyException("交易失败，余额不足，当前余额为:"+bankFrom.getBalance());
        }

        if (name=="Deposit"){
            System.out.println("交易类型：【存钱】，姓名："+bankFrom.getName()+"，余额："+bankFrom.getBalance()+",存入"+money+"元");
        } else if (name=="Withdraw"){
            System.out.println("交易类型：【取钱】，姓名："+bankFrom.getName()+"，余额："+bankFrom.getBalance()+",取出"+money+"元");
        } else if(name=="Transfer"){
            System.out.println("交易类型：【转账】，姓名："+bankFrom.getName()+"，余额："+bankFrom.getBalance()+", 转给"+bankTo.getName()+ money +"元");
        }

    }

    //返回通知  系统日志打印账户姓名和余额消息
    @AfterReturning(value = "poincut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        if (name=="Transfer"){
            List<Bank> bankList = (List<Bank>) result;
            System.out.println("交易成功，姓名："+bankList.get(0).getName()+" 余额："+bankList.get(0).getBalance());
            System.out.println("姓名："+bankList.get(1).getName()+" 余额："+bankList.get(1).getBalance());
        } else {
            Bank bank = (Bank) result;
            System.out.println("交易成功，姓名："+bank.getName()+" 余额："+bank.getBalance());
        }
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println();
    }

}
