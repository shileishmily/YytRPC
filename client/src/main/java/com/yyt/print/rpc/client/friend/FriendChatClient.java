package com.yyt.print.rpc.client.friend;

import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import com.youguu.core.util.RPCServiceClient;
import com.youguu.core.util.rpc.multipex.RPCMultiplexConnection;
import com.youguu.core.util.rpc.multipex.RPCMultiplexPool;
import com.yyt.print.rpc.common.Constants;
import com.yyt.print.rpc.thrift.gen.FriendChatThriftRpcService;
import org.apache.thrift.TException;

/**
 * Created by SomeBody on 2016/9/23.
 */
public class FriendChatClient implements FriendChatThriftRpcService.Iface {

    private static final Log logger = LogFactory.getLog(Constants.QUANT_RPC_CLIENT);

    private static RPCMultiplexPool pool = RPCServiceClient.getMultiplexCPool(Constants.QuantRpcPOOL);

    private RPCMultiplexConnection getConnection(){
        try {
            return pool.borrowObject();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return null;
    }

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
