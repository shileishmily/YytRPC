package com.yyt.print.rpc.client;

import com.yyt.print.rpc.client.friend.FriendChatRpcServiceImpl;
import com.yyt.print.rpc.client.friend.IFriendChatRpcService;


public class YytRpcClientFactory {
    private static IFriendChatRpcService friendChatRpcService = null;

    public static IFriendChatRpcService getFriendChatRpcService() {
        if (friendChatRpcService != null) {
            return friendChatRpcService;
        } else {
            synchronized (YytRpcClientFactory.class) {
                if (friendChatRpcService != null) {
                    return friendChatRpcService;
                } else {
                    friendChatRpcService = new FriendChatRpcServiceImpl();
                }
            }
        }
        return friendChatRpcService;
    }


}
