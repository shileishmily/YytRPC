package com.yyt.print.ad.service.impl;

import com.youguu.core.util.PageHolder;
import com.yyt.print.ad.pojo.AdCategory;
import com.yyt.print.ad.service.IAdCategoryService;
import com.yyt.print.base.BaseTestClass;
import org.junit.Test;

import java.util.Date;

public class AdCategoryServiceTest extends BaseTestClass {

    IAdCategoryService adCategoryService = (IAdCategoryService) getBean("adCategoryService");

    @Test
    public void testSaveAdCategory() throws Exception {
        AdCategory category = new AdCategory();
        category.setId("0002");
        category.setName("纸张");
        category.setCreateTime(new Date());
        adCategoryService.saveAdCategory(category);
    }

    @Test
    public void testUpdateAdCategory() throws Exception {
        AdCategory category = adCategoryService.getAdCategory("0001");
        category.setName("油墨");
        adCategoryService.updateAdCategory(category);
    }

    @Test
    public void testDeleteAdCategory() throws Exception {
        adCategoryService.deleteAdCategory("0001");
    }

    @Test
    public void testGetAdCategory() throws Exception {
        AdCategory category = adCategoryService.getAdCategory("0001");
        System.out.println(category);
    }

    @Test
    public void testQueryAdCategoryByPage() throws Exception {
        PageHolder<AdCategory>  pageHolder = adCategoryService.queryAdCategoryByPage(null, 1, 50);
        System.out.println(pageHolder.size());
    }
}