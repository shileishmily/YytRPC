package com.yyt.print.info.dao.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.base.YytBaseDAO;
import com.yyt.print.fragment.pojo.FragmentHome;
import com.yyt.print.info.dao.IFragmentHomeDAO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * Created by SomeBody on 2016/9/25.
 */
@Repository
public class FragmentHomeDAO extends YytBaseDAO<FragmentHome> implements IFragmentHomeDAO {
    @Override
    public int saveFragmentHome(FragmentHome fragmentHome) {
        return 0;
    }

    @Override
    public int updateFragmentHome(FragmentHome fragmentHome) {
        return 0;
    }

    @Override
    public int deleteFragmentHome(int id) {
        return 0;
    }

    @Override
    public FragmentHome getFragmentHome(int id) {
        return null;
    }

    @Override
    public PageHolder<FragmentHome> queryFragmentHomeByPage(HashMap<String, Object> paramMap, int pageIndex, int pageSize) {
        return null;
    }
}
