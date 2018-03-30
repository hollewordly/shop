package com.bbu.shop.service;

import com.bbu.shop.pojo.dto.Page;
import com.bbu.shop.pojo.po.Category;
import com.bbu.shop.pojo.po.Product;
import com.bbu.shop.pojo.vo.ProductCustom;

import java.util.List;

/**
 * 商品的业务逻辑接口
 */
public interface ICategoryService {

    List<Category> listCategory();
}
