package com.yanglf.user.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yanglf
 * @description
 * @since 2019/2/14
 **/
@Data
@Builder
public class TbAccount {
    private Long id;
    private Long userId;
    private BigDecimal amount;
    private Date createTime;
    private Date modifyTime;
}
