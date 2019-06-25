package com.yanglf.user.model;

import lombok.Data;

/**
 * @author yanglf
 * @description
 * @since 2019/6/25
 **/
@Data
public class AccountTransaction {
    /**
     * 事务id
     */
    private String txId;
    /**
     * 操作账户
     */
    private String accountNo;
    /**
     * 操作金额
     */
    private double amount;
    /**
     * 操作类型，扣帐还是入账
     */
    private String type;

    /**
     * 状态 初始状态I，如果提交则更新为C状态，如果失败则删除记录
     */
    private String status;

}
