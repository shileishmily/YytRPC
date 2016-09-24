package com.yyt.print.ad.dao.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.ad.dao.IAdCategoryDAO;
import com.yyt.print.ad.pojo.AdCategory;
import com.yyt.print.base.YytBaseDAO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * Created by SomeBody on 2016/9/24.
 */
@Repository
public class AdCategoryDAO extends YytBaseDAO<AdCategory> implements IAdCategoryDAO {
    @Override
    public int saveAdCategory(AdCategory category) {
        return 0;
    }

    @Override
    public int updateAdCategory(AdCategory category) {
        return 0;
    }

    @Override
    public int deleteAdCategory(int id) {
        return 0;
    }

    @Override
    public AdCategory getAdCategory(int id) {
        return null;
    }

    @Override
    public PageHolder<AdCategory> queryAdCategoryByPage(HashMap<String, Object> paramMap, int pageIndex, int pageSize) {
        return null;
    }
}
