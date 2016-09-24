package com.yyt.print.info.service.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.fragment.pojo.FragmentHome;
import com.yyt.print.info.dao.IFragmentHomeDAO;
import com.yyt.print.info.service.IFragmentHomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by SomeBody on 2016/9/25.
 */
@Service("fragmentHomeService")
public class FragmentHomeService implements IFragmentHomeService {
    @Resource
    private IFragmentHomeDAO fragmentHomeDAO;

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
