package com.bbu.shop.service.impl;

import com.bbu.shop.dao.CategoryMapper;
import com.bbu.shop.pojo.po.Category;
import com.bbu.shop.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryMapper mapper;
    @Override
    public List<Category> listCategory() {
        List<Category> list = mapper.listCategory();
        return list;
    }
}
