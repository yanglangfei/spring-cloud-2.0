package com.yanglf.feign.fallback;
import com.yanglf.feign.UserClient;
import com.yanglf.user.model.TbUser;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author yanglf
 * @description
 * @since 2019/2/15
 **/
@Component
public class UserFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable throwable) {
        return id -> TbUser.builder()
                .userName("default")
                .build();
    }
}
