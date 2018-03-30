package com.bbu.shop.pojo.vo;

import com.bbu.shop.pojo.po.Product;

import java.io.Serializable;

public class ProductCustom extends Product implements Serializable{

    private String cat_name;

    private String statusName;

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
