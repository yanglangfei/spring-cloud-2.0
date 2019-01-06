package com.yanglf.order.model.vo;

import lombok.Builder;
import lombok.Data;

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
    private int id;
    private String orderCode;
    private int status;
    private String userName;
    private Date createTime;
}
