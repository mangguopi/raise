package com.mango.model;

import java.util.List;

/**
 * ClassName 食物
 * Author: 周加辉
 * Date: 2018/7/3
 * Version 1.0
 * Description: TODO
 */
public class 食物 {
    private List<品类> category;

    public List<品类> getCategory() {
        return category;
    }

    public void setCategory(List<品类> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "食物{" +
                "category=" + category +
                '}';
    }
}
