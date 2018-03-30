package com.bbu.shop.pojo.po;

import java.io.Serializable;
import java.sql.Date;


public class Product implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pro_id
     *
     * @mbggenerated
     */
    private Integer pro_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pro_name
     *
     * @mbggenerated
     */
    private String pro_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pro_price
     *
     * @mbggenerated
     */
    private Double pro_price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pro_image
     *
     * @mbggenerated
     */
    private String pro_image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pro_desc
     *
     * @mbggenerated
     */
    private String pro_desc;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pro_date
     *
     * @mbggenerated
     */
    private Date pro_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pro_status
     *
     * @mbggenerated
     */
    private Integer pro_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.cat_id
     *
     * @mbggenerated
     */
    private Integer cat_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pro_id
     *
     * @return the value of product.pro_id
     *
     * @mbggenerated
     */
    public Integer getPro_id() {
        return pro_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pro_id
     *
     * @param pro_id the value for product.pro_id
     *
     * @mbggenerated
     */
    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pro_name
     *
     * @return the value of product.pro_name
     *
     * @mbggenerated
     */
    public String getPro_name() {
        return pro_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pro_name
     *
     * @param pro_name the value for product.pro_name
     *
     * @mbggenerated
     */
    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pro_price
     *
     * @return the value of product.pro_price
     *
     * @mbggenerated
     */
    public Double getPro_price() {
        return pro_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pro_price
     *
     * @param pro_price the value for product.pro_price
     *
     * @mbggenerated
     */
    public void setPro_price(Double pro_price) {
        this.pro_price = pro_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pro_image
     *
     * @return the value of product.pro_image
     *
     * @mbggenerated
     */
    public String getPro_image() {
        return pro_image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pro_image
     *
     * @param pro_image the value for product.pro_image
     *
     * @mbggenerated
     */
    public void setPro_image(String pro_image) {
        this.pro_image = pro_image == null ? null : pro_image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pro_desc
     *
     * @return the value of product.pro_desc
     *
     * @mbggenerated
     */
    public String getPro_desc() {
        return pro_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pro_desc
     *
     * @param pro_desc the value for product.pro_desc
     *
     * @mbggenerated
     */
    public void setPro_desc(String pro_desc) {
        this.pro_desc = pro_desc == null ? null : pro_desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pro_date
     *
     * @return the value of product.pro_date
     *
     * @mbggenerated
     */
    public Date getPro_date() {
        return pro_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pro_date
     *
     * @param pro_date the value for product.pro_date
     *
     * @mbggenerated
     */
    public void setPro_date(Date pro_date) {
        this.pro_date = pro_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pro_status
     *
     * @return the value of product.pro_status
     *
     * @mbggenerated
     */
    public Integer getPro_status() {
        return pro_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pro_status
     *
     * @param pro_status the value for product.pro_status
     *
     * @mbggenerated
     */
    public void setPro_status(Integer pro_status) {
        this.pro_status = pro_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.cat_id
     *
     * @return the value of product.cat_id
     *
     * @mbggenerated
     */
    public Integer getCat_id() {
        return cat_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.cat_id
     *
     * @param cat_id the value for product.cat_id
     *
     * @mbggenerated
     */
    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }
}