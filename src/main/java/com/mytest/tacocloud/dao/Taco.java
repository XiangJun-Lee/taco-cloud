package com.mytest.tacocloud.dao;

import lombok.Data;

import java.util.List;

/**
 * @author leelixiangjun
 * @date 2021/9/7 17:49
 */
@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
