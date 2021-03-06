package com.yanglf.order.model.vo;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@Data
@Builder
public class OrderVo {
    private Long id;
    private String orderCode;
    private int status;
    private String userName;
    private Date createTime;
    private BigDecimal amount;
    private Long userId;
}
