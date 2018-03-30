package com.bbu.shop.dao;

import com.bbu.shop.pojo.dto.Page;
import com.bbu.shop.pojo.po.Product;
import com.bbu.shop.pojo.vo.ProductCustom;
import com.bbu.shop.pojo.vo.ProductQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCustomMapper {

    List<ProductCustom> selectByPage(@Param("page") Page page, @Param("query") ProductQuery query);

    long countProduct(@Param("query") ProductQuery query);
}
