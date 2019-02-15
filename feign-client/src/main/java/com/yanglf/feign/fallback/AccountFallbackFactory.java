package com.yanglf.feign.fallback;

import com.yanglf.feign.AccountClient;
import com.yanglf.user.model.TbAccount;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author yanglf
 * @description
 * @since 2019/2/15
 **/
@Component
public class AccountFallbackFactory implements FallbackFactory<AccountClient> {

    @Override
    public AccountClient create(Throwable throwable) {
        return userId -> TbAccount.builder()
                .amount(BigDecimal.valueOf(0))
                .build();
    }
}
