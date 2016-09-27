package com.yyt.print.user.service.impl;

import com.yyt.print.user.pojo.User;
import com.yyt.print.user.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by SomeBody on 2016/9/27.
 */
@Service("userService")
public class UserService implements IUserService {
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
