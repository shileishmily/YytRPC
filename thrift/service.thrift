service FriendChatThriftRpcService {

    /**
     * 保存好友关系
     * @param userId 用户ID
     * @param friendId 好友ID
     * @return
     */
    i32 saveFriend(1:i32 userId, 2:i32 friendId);

    /**
     * 删除好友关系
     * @param userId 用户ID
     * @param friendId 好友ID
     * @return
     */
    i32 deleteFriend(1:i32 userId, 2:i32 friendId);

    /**
     * 查询好友关系是否存在
     * @param userId
     * @param friendId
     * @return
     */
    string getFriend(1:i32 userId, 2:i32 friendId);

    /**
     * 查询我的好友列表
     * @param userId 用户ID
     * @return
     */
    string queryMyFriend(1:i32 userId);


    /**
     * 保存申请关系，申请成为好友调用
     * @param friendApply
     * @return
     */
    i32 saveFriendApply(1:string friendApply);

    /**
     * 查询状态为‘申请中’的好友申请
     * @param userId
     * @return
     */
    string queryFriendApply(1:i32 userId);

    /**
     * 同意申请，成为好友
     * @param applyId 申请ID
     * @param userId 用户ID
     * @param friendId 好友ID
     * @return
     */
    i32 agreeFriendApply(1:i32 applyId, 2:i32 userId, 3:i32 friendId);

    /**
     * 拒绝申请
     * @param applyId 申请ID
     * @param userId 用户ID
     * @param friendId 好友ID
     * @return
     */
    i32 refuseFriendApply(1:i32 applyId, 2:i32 userId, 3:i32 friendId);

    /**
     * 创建会话，首次发起聊天时创建
     * @param chatSession
     * @return
     */
    i32 saveChatSession(1:string chatSession);

    /**
     * 查询会话列表
     * @param userId 用户ID
     * @param position 起始位置
     * @param size 条数
     * @return
     */
    string queryChatSessionList(1:i32 userId, 2:i32 position, 3:i32 size);

    /**
     * 根据会话ID查询聊天记录
     * @param sessionId
     * @param position
     * @param size
     * @return
     */
    string queryChartRecordList(1:i32 sessionId, 2:i32 position, 3:i32 size);

    /**
     * 发送消息
     * @param userId
     * @param msgId 消息ID，重新发送时使用
     * @param msgContent 消息内容
     * @param type 消息内容类型
     * @return 返回消息ID
     */
    i32 sendMsg(1:i32 userId, 2:i32 msgId, 3:string msgContent, 4:i32 type);
}


service InfoThriftRpcService {

}


service ProductThriftRpcService {

}

service AdThriftRpcService {

}

service UserThriftRpcService {

}