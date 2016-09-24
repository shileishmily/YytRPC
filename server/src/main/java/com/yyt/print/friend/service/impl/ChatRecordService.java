package com.yyt.print.friend.service.impl;

import com.yyt.print.friend.dao.IChatRecordDAO;
import com.yyt.print.friend.pojo.ChatRecord;
import com.yyt.print.friend.service.IChatRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by SomeBody on 2016/9/24.
 */
@Service("chatRecordService")
public class ChatRecordService implements IChatRecordService {

    @Resource
    private IChatRecordDAO chatRecordDAO;

    @Override
    public List<ChatRecord> queryChartRecordList(int sessionId, int position, int size) {
        return null;
    }

    @Override
    public int sendMsg(int userId, int msgId, String msgContent, int type) {
        return 0;
    }
}
