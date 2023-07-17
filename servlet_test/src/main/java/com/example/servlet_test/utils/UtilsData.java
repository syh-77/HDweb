package com.example.servlet_test.utils;

import com.example.servlet_test.model.GoodsModel;
import com.example.servlet_test.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UtilsData {
    public static List<UserModel> uList = new ArrayList<>();
    public static List<GoodsModel> GList = new ArrayList<>();
    public static int gId=4;
    public static int uId;
    static {
        uList.add(new UserModel(1,"张思","女","成都","123456"));
        uList.add(new UserModel(2,"张思1","女","兰州","123456"));
        uList.add(new UserModel(3,"张思2","女","成都","123456"));


        GList.add(new GoodsModel(1,"鞋子","黑色",34));
        GList.add(new GoodsModel(2,"衣服","白色",65));
        GList.add(new GoodsModel(3,"鞋子2","黑色",34));
        GList.add(new GoodsModel(4,"鞋子3","黑色",34));
    }
}
