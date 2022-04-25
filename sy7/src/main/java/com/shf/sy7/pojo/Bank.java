package com.shf.sy7.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
    private Integer Id;
    private String name;
    private Double balance;
}
