package Utils;

import Model.ShopModel;

import javax.swing.plaf.SliderUI;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UtilsData {
    public static List<ShopModel> SList=new ArrayList<>();
    public static void main(){
        SList.add(new ShopModel(1,"鞋子",3,20));
        SList.add(new ShopModel(2,"帽子",4,50));
        SList.add(new ShopModel(3,"披风",6,60));
        SList.add(new ShopModel(4,"裤子",6,70));
    }

}
