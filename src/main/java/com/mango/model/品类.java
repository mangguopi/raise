package com.mango.model;

import java.util.List;

/**
 * ClassName 品类
 * Author: 周加辉
 * Date: 2018/7/3
 * Version 1.0
 * Description: TODO
 */
public class 品类 implements Comparable<品类> {
    private String name;

    private int sort;

    private List<Foods> foods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public List<Foods> getFoods() {
        return foods;
    }

    public void setFoods(List<Foods> foods) {
        this.foods = foods;
    }

    public 品类(String name, int sort) {
        this.name = name;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "品类{" +
                "name='" + name + '\'' +
                ", sort=" + sort +
                ", foods=" + foods +
                '}';
    }

    @Override
    public int compareTo(品类 o) {
        int result = 0;
        if (0 == result) {
            result = (this.sort - o.sort);
        }
        return result;
    }
}
