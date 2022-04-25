package com.shf.sy7.exception;

public class MyException extends Exception{
    public MyException(){

    }

    public MyException(String msg){
        super(msg);
        System.out.println(msg);
    }
}
