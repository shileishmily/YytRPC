package com.yyt.print.friend.dao.impl;

import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.friend.dao.IFriendDAO;
import com.yyt.print.friend.pojo.Friend;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SomeBody on 2016/9/23.
 */
@Repository
public class FriendDAO extends YytBaseDAO<Friend> implements IFriendDAO {
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
}
