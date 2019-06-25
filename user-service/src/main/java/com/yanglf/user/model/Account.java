package com.yanglf.user.model;

import lombok.Data;

/**
 * @author yanglf
 * @description
 * @since 2019/6/25
 **/
@Data
public class Account {
    /**
     * 账户
     */
    private String accountNo;
    /**
     * 余额
     */
    private double amount;
    /**
     * 冻结金额
     */
    private double freezedAmount;
}
