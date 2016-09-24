package com.yyt.print.friend.dao.impl;

import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.friend.dao.IChatRecordDAO;
import com.yyt.print.friend.pojo.ChatRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SomeBody on 2016/9/24.
 */
@Repository
public class ChatRecordDAO extends YytBaseDAO<ChatRecord> implements IChatRecordDAO {

    @Override
    public List<ChatRecord> queryChartRecordList(int sessionId, int position, int size) {
        return null;
    }

    @Override
    public int sendMsg(int userId, int msgId, String msgContent, int type) {
        return 0;
    }

    @Override
    public ChatRecord getChatRecord(int id) {
        return null;
    }

    @Override
    public int updatePushType(int id, int pushType) {
        return 0;
    }
}
