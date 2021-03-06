package com.mytest.tacocloud.dao;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author leelixiangjun
 * @date 2021/9/7 17:37
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE;
    }
}
