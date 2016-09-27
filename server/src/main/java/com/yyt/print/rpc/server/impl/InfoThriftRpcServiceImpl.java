package com.yyt.print.rpc.server.impl;

import com.yyt.print.rpc.thrift.gen.InfoThriftRpcService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by SomeBody on 2016/9/23.
 */
@Service("infoThriftRpcService")
public class InfoThriftRpcServiceImpl implements InfoThriftRpcService.Iface {
    @Override
    public int saveFragmentHome(String fragmentHome) throws TException {
        return 0;
    }

    @Override
    public int updateFragmentHome(String fragmentHome) throws TException {
        return 0;
    }

    @Override
    public int deleteFragmentHome(int id) throws TException {
        return 0;
    }

    @Override
    public String getFragmentHome(int id) throws TException {
        return null;
    }

    @Override
    public String queryFragmentHomeByPage(Map<String, String> paramMap, int pageIndex, int pageSize) throws TException {
        return null;
    }

    @Override
    public int saveInfoCategory(String category) throws TException {
        return 0;
    }

    @Override
    public int updateInfoCategory(String category) throws TException {
        return 0;
    }

    @Override
    public int deleteInfoCategory(int id) throws TException {
        return 0;
    }

    @Override
    public String getInfoCategory(int id) throws TException {
        return null;
    }

    @Override
    public String findInfoCategoryByParentId(int parentId) throws TException {
        return null;
    }

    @Override
    public String queryInfoCategoryByPage(Map<String, String> paramMap, int pageIndex, int pageSize) throws TException {
        return null;
    }

    @Override
    public int saveInfoContent(String infoContent) throws TException {
        return 0;
    }

    @Override
    public int deleteInfoContent(int id) throws TException {
        return 0;
    }

    @Override
    public int updateInfoContent(String infoContent) throws TException {
        return 0;
    }

    @Override
    public String getInfoContent(int id) throws TException {
        return null;
    }

    @Override
    public String queryInfoContentByPage(Map<String, String> paramMap, int pageIndex, int pageSize) throws TException {
        return null;
    }

    @Override
    public String queryInfoContentList(String title, String des, int id, int limit) throws TException {
        return null;
    }
}
