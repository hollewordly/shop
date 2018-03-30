package com.bbu.shop.web;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.bbu.shop.pojo.dto.MessageResult;
import com.bbu.shop.pojo.dto.Page;
import com.bbu.shop.pojo.po.Product;
import com.bbu.shop.pojo.vo.ProductCustom;
import com.bbu.shop.pojo.vo.ProductQuery;
import com.bbu.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.List;

@Controller
public class ProductAction {

    @Autowired
    private ItemService itemService;


    @ResponseBody
    @RequestMapping(value = "/items")
    public MessageResult<ProductCustom> listItemsToJson(Page page, ProductQuery query){
        //从后台查询到的list集合  封装到MessageResult中
        MessageResult<ProductCustom> messageResult = new MessageResult<ProductCustom>();
        try {
            // 调用业务逻辑方法查询所有商品列表
            List<ProductCustom> productList = itemService.listItems(page,query);
            //调用业务层查询所有记录的条数(符合条件：多条件查询 模糊查询  排序等等)
            long count = itemService.countProduct(query);
            //封装MessageResult
            messageResult.setCode(0);
            messageResult.setCount(count);
            messageResult.setMsg("success");
            messageResult.setData(productList);
            System.out.println(111);
        }catch (Exception e){
            e.printStackTrace();
        }
        return messageResult;
    }
    //批量删除
    @ResponseBody
    @RequestMapping(value = "/item/batch",method = RequestMethod.POST)
    public int batchUpdate(@RequestParam(value = "ids[]") List<Integer> ids){
        int i = 0;
        try {
            //调用业务逻辑层方法
            i = itemService.batchUpdate(ids);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    //通过id删除商品
    @ResponseBody
    @RequestMapping(value = "/delete" ,method = RequestMethod.POST)
    public int deletePro(@RequestParam(value = "pro_id") int pro_id){
        int i = 0;
        try {
            //调用业务逻辑层方法
            i = itemService.deletePro(pro_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(i==0){
            return 0;
        }else {
            return 1;
        }
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public int addPro(Product product){

        int i =0;
        try {
            i = itemService.itemAdd(product);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(i==0){
            return 0;
        }else{
            return 1;
        }

    }
    //通过id编辑商品
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public int editPro(Product product){
        int i = 0;
        try {
            i = itemService.editPro(product);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(i==0){
            return 0;
        }else{
            return 1;
        }
    }

}
