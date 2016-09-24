package com.yyt.print.info.dao.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.info.dao.IInfoCategoryDAO;
import com.yyt.print.info.pojo.InfoCategory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by SomeBody on 2016/9/25.
 */
@Repository
public class InfoCategoryDAO extends YytBaseDAO<InfoCategory> implements IInfoCategoryDAO {
    @Override
    public int saveInfoCategory(InfoCategory category) {
        return 0;
    }

    @Override
    public int updateInfoCategory(InfoCategory category) {
        return 0;
    }

    @Override
    public int deleteInfoCategory(int id) {
        return 0;
    }

    @Override
    public InfoCategory getInfoCategory(int id) {
        return null;
    }

    @Override
    public List<InfoCategory> findInfoCategoryByParentId(int parentId) {
        return null;
    }

    @Override
    public PageHolder<InfoCategory> queryInfoCategoryByPage(HashMap<String, Object> paramMap, int pageIndex, int pageSize) {
        return null;
    }
}
