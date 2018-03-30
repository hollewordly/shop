package com.bbu.shop.search.pojo.po;

public class Orders {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_id
     *
     * @mbggenerated
     */
    private Integer order_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_name
     *
     * @mbggenerated
     */
    private String order_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_price
     *
     * @mbggenerated
     */
    private Double order_price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_status
     *
     * @mbggenerated
     */
    private Integer order_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_number
     *
     * @mbggenerated
     */
    private Integer order_number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbggenerated
     */
    private Integer user_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_id
     *
     * @return the value of orders.order_id
     *
     * @mbggenerated
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_id
     *
     * @param order_id the value for orders.order_id
     *
     * @mbggenerated
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_name
     *
     * @return the value of orders.order_name
     *
     * @mbggenerated
     */
    public String getOrder_name() {
        return order_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_name
     *
     * @param order_name the value for orders.order_name
     *
     * @mbggenerated
     */
    public void setOrder_name(String order_name) {
        this.order_name = order_name == null ? null : order_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_price
     *
     * @return the value of orders.order_price
     *
     * @mbggenerated
     */
    public Double getOrder_price() {
        return order_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_price
     *
     * @param order_price the value for orders.order_price
     *
     * @mbggenerated
     */
    public void setOrder_price(Double order_price) {
        this.order_price = order_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_status
     *
     * @return the value of orders.order_status
     *
     * @mbggenerated
     */
    public Integer getOrder_status() {
        return order_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_status
     *
     * @param order_status the value for orders.order_status
     *
     * @mbggenerated
     */
    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_number
     *
     * @return the value of orders.order_number
     *
     * @mbggenerated
     */
    public Integer getOrder_number() {
        return order_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_number
     *
     * @param order_number the value for orders.order_number
     *
     * @mbggenerated
     */
    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbggenerated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param user_id the value for orders.user_id
     *
     * @mbggenerated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}