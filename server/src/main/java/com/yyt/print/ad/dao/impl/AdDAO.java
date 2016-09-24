package com.yyt.print.ad.dao.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.ad.dao.IAdDAO;
import com.yyt.print.ad.pojo.Ad;
import com.yyt.print.base.YytBaseDAO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * Created by SomeBody on 2016/9/24.
 */
@Repository
public class AdDAO extends YytBaseDAO<Ad> implements IAdDAO {
    @Override
    public int saveAd(Ad ad) {
        return 0;
    }

    @Override
    public int updateAd(Ad ad) {
        return 0;
    }

    @Override
    public int deleteAd(int id) {
        return 0;
    }

    @Override
    public Ad getAd(int id) {
        return null;
    }

    @Override
    public PageHolder<Ad> queryAdByPage(HashMap<String, Object> paramMap, int pageIndex, int pageSize) {
        return null;
    }
}
