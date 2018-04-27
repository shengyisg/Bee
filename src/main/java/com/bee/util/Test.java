package com.bee.util;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by fsy on 2018/4/24 0024.
 */
public class Test {

    public static void main(String[] args) {
        JSONObject i = new JSONObject();
        i.put("111",null);
        String ww =i.getString("test");
        System.out.println(ww);
    }
}
