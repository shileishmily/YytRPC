package com.yyt.print.friend.service;

import com.yyt.print.friend.pojo.ChatRecord;

import java.util.List;

/**
 * Created by SomeBody on 2016/9/23.
 */
public interface IChatRecordService {

    /**
     * 根据会话ID查询聊天记录
     * @param sessionId
     * @param position
     * @param size
     * @return
     */
    public List<ChatRecord> queryChartRecordList(int sessionId, int position, int size);

    /**
     * 发送消息
     * @param userId
     * @param msgId 消息ID，重新发送时使用
     * @param msgContent 消息内容
     * @param type 消息内容类型
     * @return 返回消息ID
     */
    public int sendMsg(int userId, int msgId, String msgContent, int type);

}
