package com.bbu.shop.service;

import com.bbu.shop.pojo.dto.Page;
import com.bbu.shop.pojo.po.Product;
import com.bbu.shop.pojo.vo.ProductCustom;
import com.bbu.shop.pojo.vo.ProductQuery;

import java.util.List;

/**
 * 商品的业务逻辑接口
 */
public interface ItemService {
    List<ProductCustom> listItems(Page page, ProductQuery query);

    long countProduct(ProductQuery query);

    int itemAdd(Product product);

    int deletePro(int pro_id);

    int editPro(Product product);

    int batchUpdate(List<Integer> ids);
}
