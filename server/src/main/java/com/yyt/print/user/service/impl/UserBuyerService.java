package com.yyt.print.user.service.impl;

import com.yyt.print.user.pojo.UserBuyer;
import com.yyt.print.user.service.IUserBuyerService;
import org.springframework.stereotype.Service;

/**
 * Created by SomeBody on 2016/9/27.
 */
@Service("userBuyerService")
public class UserBuyerService implements IUserBuyerService {
    @Override
    public int saveUserBuyer(UserBuyer userBuyer) {
        return 0;
    }

    @Override
    public UserBuyer getUserBuyer(int userId) {
        return null;
    }

    @Override
    public int updateUserBuyer(UserBuyer userBuyer) {
        return 0;
    }
}
