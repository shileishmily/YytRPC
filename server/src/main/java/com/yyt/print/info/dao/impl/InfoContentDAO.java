package com.yyt.print.info.dao.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.info.dao.IInfoContentDAO;
import com.yyt.print.info.pojo.InfoContent;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by SomeBody on 2016/9/25.
 */
@Repository
public class InfoContentDAO extends YytBaseDAO<InfoContent> implements IInfoContentDAO {
    @Override
    public int saveInfoContent(InfoContent infoContent) {
        return 0;
    }

    @Override
    public int deleteInfoContent(int id) {
        return 0;
    }

    @Override
    public int updateInfoContent(InfoContent infoContent) {
        return 0;
    }

    @Override
    public InfoContent getInfoContent(int id) {
        return null;
    }

    @Override
    public PageHolder<InfoContent> queryInfoContentByPage(HashMap<String, Object> paramMap, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public List<InfoContent> queryInfoContentList(String title, String des, int id, int limit) {
        return null;
    }
}
