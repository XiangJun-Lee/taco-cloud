package com.mytest.tacocloud.dao;

import lombok.Data;

/**
 * @author leelixiangjun
 * @date 2021/9/7 21:07
 */
@Data
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
