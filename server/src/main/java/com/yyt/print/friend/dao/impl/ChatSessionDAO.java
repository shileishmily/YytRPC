package com.yyt.print.friend.dao.impl;

import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.friend.dao.IChatSessionDAO;
import com.yyt.print.friend.pojo.ChatSession;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SomeBody on 2016/9/24.
 */
@Repository
public class ChatSessionDAO extends YytBaseDAO<ChatSession> implements IChatSessionDAO {
    @Override
    public int saveChatSession(ChatSession chatSession) {
        return 0;
    }

    @Override
    public ChatSession getChatSession(int userId, int friendId) {
        return null;
    }

    @Override
    public List<ChatSession> queryChatSessionList(int userId, int position, int size) {
        return null;
    }
}
