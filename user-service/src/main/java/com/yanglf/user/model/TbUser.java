package com.yanglf.user.model;

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
public class TbUser {
    private int id;
    private String userName;
    private String password;
    private int age;
    private String address;
    private Date createTime;
    private Date modifyTime;
}
