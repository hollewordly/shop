package com.bbu.shop.search.pojo.dto;

import com.bbu.shop.search.pojo.vo.TbSearchItemCustom;

import java.util.List;

/**
 * User: DHC
 * Date: 2018/3/29
 * Time: 14:33
 * Version:V1.0
 */
public class TbSearchItemCustomResult {
    //符合条件的总记录数
    private long recordCount;
    //总页数
    private long totalPages;
    //指定分页的集合
    private List<TbSearchItemCustom> list;

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<TbSearchItemCustom> getList() {
        return list;
    }

    public void setList(List<TbSearchItemCustom> list) {
        this.list = list;
    }
}
