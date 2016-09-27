package com.yyt.print.user.service.impl;

import com.yyt.print.user.pojo.UserSeller;
import com.yyt.print.user.service.IUserSellerService;
import org.springframework.stereotype.Service;

/**
 * Created by SomeBody on 2016/9/27.
 */
@Service("userSellerService")
public class UserSellerService implements IUserSellerService {
    @Override
    public int saveUserSeller(UserSeller userSeller) {
        return 0;
    }

    @Override
    public UserSeller getUserSeller(int userId) {
        return null;
    }

    @Override
    public int updateUserSeller(UserSeller userSeller) {
        return 0;
    }
}
