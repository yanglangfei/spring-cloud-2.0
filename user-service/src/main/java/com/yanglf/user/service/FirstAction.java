package com.yanglf.user.service;

/**
 * @author yanglf
 * @description
 * @since 2019/6/25
 **/
public interface FirstAction {

    /**
     * 一阶段
     *  1、 查询账户余额是否充足
     *  2、记一笔账户操作流水  AccountTransaction
     *  3、 再递增冻结金额，表示这部分钱已经被冻结，不能使用
     * @param accountNo
     * @param amount
     */
    void prepareMinus(String accountNo, double amount);


    /**
     * 二阶段 提交
     *  1、 查询到账户操作流水  AccountTransaction
     *  2、 判断 事务数据是否删除  状态-重复提交幂等保证只做一次
     *  3、 扣除金额  不足抛异常   冻结资金减少
     *  4、事务成功之后更新为C
     * @return
     */
    boolean commit();


    /**
     * 二阶段  回滚
     * 1、 冻结资金减少
     * 2、 删除流水
     * @return
     */
    boolean rollback();
}
