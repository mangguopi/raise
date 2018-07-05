package com.mango.controller;


import com.mango.common.tool.FastJsonUtils;
import com.mango.model.Foods;
import com.mango.model.品类;
import com.mango.model.食物;

import java.lang.reflect.Field;
import java.util.*;

/**
 * ClassName MyTest
 * Author: 周加辉
 * Date: 2018/7/3
 * Version 1.0
 * Description: TODO
 */
public class MyTest {
    public static void main(String[] args) {

        List<Foods> list = new ArrayList<Foods>();
        list.add(new Foods("香蕉", "水果", 1));
        list.add(new Foods("苹果", "水果", 4));
        list.add(new Foods("梨子", "水果", 2));
        list.add(new Foods("西瓜", "水果", 3));
        list.add(new Foods("土豆", "蔬菜", 1));
        list.add(new Foods("黄瓜", "蔬菜", 3));
        list.add(new Foods("大豆", "蔬菜", 2));

//        Collections.sort(list);
//        System.err.println(list);

        品类 p1 = new 品类("水果", 2);
        品类 p2 = new 品类("蔬菜", 1);

        List<Foods> foods_s = new ArrayList<Foods>();
        List<Foods> foods_v = new ArrayList<Foods>();
        for (Foods foods : list) {
            if ("水果".equalsIgnoreCase(foods.getCategory())) {
                foods_s.add(foods);
            } else if ("蔬菜".equalsIgnoreCase(foods.getCategory())) {
                foods_v.add(foods);
            }
        }
        Collections.sort(foods_s);
        Collections.sort(foods_v);
        p1.setFoods(foods_s);
        p2.setFoods(foods_v);
        食物 s = new 食物();
        List<品类> listP = new ArrayList<品类>();
        listP.add(p1);
        listP.add(p2);
        Collections.sort(listP);
        s.setCategory(listP);

        System.err.println(FastJsonUtils.toString(s));


    }
}
