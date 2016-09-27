package com.yyt.print.rpc.client.ad;

import com.yyt.print.rpc.thrift.gen.AdThriftRpcService;
import org.apache.thrift.TException;

import java.util.Map;

/**
 * Created by SomeBody on 2016/9/27.
 */
public class AdClient implements AdThriftRpcService.Iface {
    @Override
    public int saveAd(String ad) throws TException {
        return 0;
    }

    @Override
    public int updateAd(String ad) throws TException {
        return 0;
    }

    @Override
    public int deleteAd(int id) throws TException {
        return 0;
    }

    @Override
    public String getAd(int id) throws TException {
        return null;
    }

    @Override
    public String queryAdByPage(Map<String, String> paramMap, int pageIndex, int pageSize) throws TException {
        return null;
    }

    @Override
    public int saveAdCategory(String category) throws TException {
        return 0;
    }

    @Override
    public int updateAdCategory(String category) throws TException {
        return 0;
    }

    @Override
    public int deleteAdCategory(int id) throws TException {
        return 0;
    }

    @Override
    public String getAdCategory(int id) throws TException {
        return null;
    }

    @Override
    public String queryAdCategoryByPage(Map<String, String> paramMap, int pageIndex, int pageSize) throws TException {
        return null;
    }
}
