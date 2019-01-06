package com.yanglf.order.model.entity;

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
public class TbOrder {
    private int id;
    private String orderCode;
    private int status;
    private int userId;
    private Date createTime;
    private Date modifyTime;
}
