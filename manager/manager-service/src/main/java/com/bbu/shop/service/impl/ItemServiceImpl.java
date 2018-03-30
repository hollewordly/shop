package com.bbu.shop.service.impl;

import com.bbu.shop.dao.ProductCustomMapper;
import com.bbu.shop.dao.ProductMapper;
import com.bbu.shop.pojo.dto.Page;
import com.bbu.shop.pojo.po.Product;
import com.bbu.shop.pojo.po.ProductExample;
import com.bbu.shop.pojo.vo.ProductCustom;
import com.bbu.shop.pojo.vo.ProductQuery;
import com.bbu.shop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductMapper mapper;

    @Override
    public int itemAdd(Product product) {
        int i = mapper.insert(product);
        return i;
    }

    @Override
    public int deletePro(int pro_id) {
        Product product = new Product();
        product.setPro_status(3);
        product.setPro_id(pro_id);
        int i = mapper.updateByPrimaryKeySelective(product);
        return i;
    }

    @Override
    public int editPro(Product product) {

        return mapper.updateByPrimaryKeySelective(product);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @Transactional
    @Override
    public int batchUpdate(List<Integer> ids) {
        int i = 0;
        try {
            //创建对象用于更新
            Product record = new Product();
            record.setPro_status(3);
            //创建模板
            ProductExample example = new ProductExample();
            //创建内部类实例
            ProductExample.Criteria criteria = example.createCriteria();
            criteria.andPro_idIn(ids);
            //执行更新
            //i就是受到影响的行数
            i = mapper.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.debug(e.getMessage(), e);
        }
        return i;
    }


    @Autowired
    private ProductCustomMapper customMapper;

    @Override
    public List<ProductCustom> listItems(Page page, ProductQuery query) {
        List<ProductCustom> productList =null;
        try {
            productList = customMapper.selectByPage(page,query);
//            productList = mapper.selectByExample(null);
          /* if (productList==null){
               System.out.println("空");
           }else{
               System.out.println("不空");
           }*/
        }catch (Exception e){
            logger.debug(e.getMessage(),e);
        }
        return productList;
    }

    @Override
    public long countProduct(ProductQuery query) {
        long count =0;
        try {
            count = customMapper.countProduct(query);
        }catch (Exception e){
            logger.debug(e.getMessage(),e);
        }
        return count;
    }
}
