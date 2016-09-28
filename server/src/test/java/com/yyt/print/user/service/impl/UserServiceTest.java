package com.yyt.print.user.service.impl;

import com.yyt.print.base.BaseTestClass;
import com.yyt.print.user.pojo.User;
import com.yyt.print.user.service.IUserService;
import org.junit.Test;

import java.util.Date;

public class UserServiceTest extends BaseTestClass {

    IUserService userService = (IUserService) getBean("userService");

    @Test
    public void testSaveUser() throws Exception {
        User user = new User();
        user.setUserName("zhangsan");
        user.setNickName("hello");
        user.setCreateTime(new Date());
        user.setEmail("123@qq.com");
        user.setPassword("111111");
        user.setPhone("18811119999");
        user.setUpdateTime(new Date());
        userService.saveUser(user);
    }

    @Test
    public void testGetUser() throws Exception {

    }

    @Test
    public void testUpdateUser() throws Exception {

    }

    @Test
    public void testGetUserList() throws Exception {

    }

    @Test
    public void testGetUserMap() throws Exception {

    }
}