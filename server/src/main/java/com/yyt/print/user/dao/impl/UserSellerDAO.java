package com.yyt.print.user.dao.impl;

import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.user.dao.IUserSellerDAO;
import com.yyt.print.user.pojo.UserSeller;
import org.springframework.stereotype.Repository;

/**
 * Created by SomeBody on 2016/9/27.
 */
@Repository
public class UserSellerDAO extends YytBaseDAO<UserSeller> implements IUserSellerDAO {

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
