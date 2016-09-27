package com.yyt.print.user.dao.impl;

import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.user.dao.IUserDAO;
import com.yyt.print.user.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by SomeBody on 2016/9/27.
 */
@Repository
public class UserDAO extends YytBaseDAO<User> implements IUserDAO {
    @Override
    public int saveUser(User user) {
        return 0;
    }

    @Override
    public User getUser(int userId) {
        return null;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public List<User> getUserList(List<Integer> userIdList) {
        return null;
    }

    @Override
    public Map<Integer, User> getUserMap(List<Integer> userIdList) {
        return null;
    }
}
