package com.yyt.print.friend.dao.impl;

import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.friend.dao.IFriendApplyDAO;
import com.yyt.print.friend.pojo.FriendApply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SomeBody on 2016/9/23.
 */
@Repository
public class FriendApplyDAO extends YytBaseDAO<FriendApply> implements IFriendApplyDAO {
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
}
