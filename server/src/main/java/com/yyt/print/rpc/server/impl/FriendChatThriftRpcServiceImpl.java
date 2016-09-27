package com.yyt.print.rpc.server.impl;

import com.yyt.print.rpc.thrift.gen.FriendChatThriftRpcService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * Created by SomeBody on 2016/9/23.
 */
@Service("friendChatThriftRpcService")
public class FriendChatThriftRpcServiceImpl implements FriendChatThriftRpcService.Iface {
    @Override
    public int saveFriend(int userId, int friendId) throws TException {
        return 0;
    }

    @Override
    public int deleteFriend(int userId, int friendId) throws TException {
        return 0;
    }

    @Override
    public String getFriend(int userId, int friendId) throws TException {
        return null;
    }

    @Override
    public String queryMyFriend(int userId) throws TException {
        return null;
    }

    @Override
    public int saveFriendApply(String friendApply) throws TException {
        return 0;
    }

    @Override
    public String queryFriendApply(int userId) throws TException {
        return null;
    }

    @Override
    public int agreeFriendApply(int applyId, int userId, int friendId) throws TException {
        return 0;
    }

    @Override
    public int refuseFriendApply(int applyId, int userId, int friendId) throws TException {
        return 0;
    }

    @Override
    public int saveChatSession(String chatSession) throws TException {
        return 0;
    }

    @Override
    public String queryChatSessionList(int userId, int position, int size) throws TException {
        return null;
    }

    @Override
    public String queryChartRecordList(int sessionId, int position, int size) throws TException {
        return null;
    }

    @Override
    public int sendMsg(int userId, int msgId, String msgContent, int type) throws TException {
        return 0;
    }
}
