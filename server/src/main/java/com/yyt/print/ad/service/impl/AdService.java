package com.yyt.print.ad.service.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.ad.dao.IAdDAO;
import com.yyt.print.ad.pojo.Ad;
import com.yyt.print.ad.service.IAdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by SomeBody on 2016/9/25.
 */
@Service("adService")
public class AdService implements IAdService {
    @Resource
    private IAdDAO adDAO;

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
