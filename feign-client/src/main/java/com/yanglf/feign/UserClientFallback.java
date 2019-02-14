package com.yanglf.feign;

import com.yanglf.user.model.TbUser;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
public class UserClientFallback implements UserClient {
    @Override
    public TbUser info(Long id) {
        return TbUser.builder()
                .userName("yanglf")
                .build();
    }
}
