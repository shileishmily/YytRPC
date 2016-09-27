package com.yyt.print.rpc.client.user;

import com.yyt.print.rpc.thrift.gen.UserThriftRpcService;
import org.apache.thrift.TException;

import java.util.List;

/**
 * Created by SomeBody on 2016/9/27.
 */
public class UserClient implements UserThriftRpcService.Iface {
    @Override
    public int saveUser(String user) throws TException {
        return 0;
    }

    @Override
    public String getUser(int userId) throws TException {
        return null;
    }

    @Override
    public int updateUser(String user) throws TException {
        return 0;
    }

    @Override
    public String getUserList(List<Integer> userIdList) throws TException {
        return null;
    }

    @Override
    public String getUserMap(List<Integer> userIdList) throws TException {
        return null;
    }

    @Override
    public int saveUserBuyer(String userBuyer) throws TException {
        return 0;
    }

    @Override
    public String getUserBuyer(int userId) throws TException {
        return null;
    }

    @Override
    public int updateUserBuyer(String userBuyer) throws TException {
        return 0;
    }

    @Override
    public int saveUserSeller(String userSeller) throws TException {
        return 0;
    }

    @Override
    public String getUserSeller(int userId) throws TException {
        return null;
    }

    @Override
    public int updateUserSeller(String userSeller) throws TException {
        return 0;
    }

    @Override
    public int saveUserThirdBind(String thirdBind) throws TException {
        return 0;
    }

    @Override
    public String getUserThirdBind(String thirdId, int type) throws TException {
        return null;
    }
}
