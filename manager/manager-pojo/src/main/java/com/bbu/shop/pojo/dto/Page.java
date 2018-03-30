package com.bbu.shop.pojo.dto;

public class Page {
    //当前页页码
    private int page;
    //每次显示的pagesize
    private int limit;

    public int getOffset(){
        return (page-1)*limit;
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
