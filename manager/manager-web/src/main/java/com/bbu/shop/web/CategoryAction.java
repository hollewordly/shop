package com.bbu.shop.web;

import com.bbu.shop.pojo.po.Category;
import com.bbu.shop.service.ICategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/category")
public class CategoryAction {
    @Autowired
    private ICategoryService service;
    @RequestMapping("/categorySelect")
    @ResponseBody
    public List<Category> listCategory(){
        System.out.println(3);
        List<Category> list = null;
        try{
            list = service.listCategory();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(list.size());
        return list;
    }
}
