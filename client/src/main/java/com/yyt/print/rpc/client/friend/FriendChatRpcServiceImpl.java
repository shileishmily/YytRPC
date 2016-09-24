package com.yyt.print.rpc.client.friend;

import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import com.yyt.print.friend.pojo.ChatRecord;
import com.yyt.print.friend.pojo.ChatSession;
import com.yyt.print.friend.pojo.Friend;
import com.yyt.print.friend.pojo.FriendApply;
import com.yyt.print.rpc.common.Constants;

import java.util.List;

/**
 * Created by SomeBody on 2016/9/23.
 */
public class FriendChatRpcServiceImpl implements IFriendChatRpcService {
    private static final Log logger = LogFactory.getLog(Constants.QUANT_RPC_CLIENT);

    private FriendChatClient getClient() {
        return new FriendChatClient();
    }

    @Override
    public int saveFriend(int userId, int friendId) {
        return 0;
    }

    @Override
    public int deleteFriend(int userId, int friendId) {
        return 0;
    }

    @Override
    public Friend getFriend(int userId, int friendId) {
        return null;
    }

    @Override
    public List<Friend> queryMyFriend(int userId) {
        return null;
    }

    @Override
    public int saveFriendApply(FriendApply friendApply) {
        return 0;
    }

    @Override
    public List<FriendApply> queryFriendApply(int userId) {
        return null;
    }

    @Override
    public int agreeFriendApply(int applyId, int userId, int friendId) {
        return 0;
    }

    @Override
    public int refuseFriendApply(int applyId, int userId, int friendId) {
        return 0;
    }

    @Override
    public int saveChatSession(ChatSession chatSession) {
        return 0;
    }

    @Override
    public List<ChatSession> queryChatSessionList(int userId, int position, int size) {
        return null;
    }

    @Override
    public List<ChatRecord> queryChartRecordList(int sessionId, int position, int size) {
        return null;
    }

    @Override
    public int sendMsg(int userId, int msgId, String msgContent, int type) {
        return 0;
    }
}
