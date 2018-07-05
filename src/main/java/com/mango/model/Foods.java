package com.mango.model;

/**
 * ClassName Foods
 * Author: 周加辉
 * Date: 2018/7/3
 * Version 1.0
 * Description: TODO
 */
public class Foods implements Comparable<Foods> {
    private String name;

    private String category;

    private int sort;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Foods(String name, String category, int sort) {
        this.name = name;
        this.category = category;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", sort=" + sort +
                '}';
    }

    @Override
    public int compareTo(Foods o) {
        int result = 0;
        if (0 == result) {
            result = (this.sort - o.sort);
        }
        return result;
    }
}
