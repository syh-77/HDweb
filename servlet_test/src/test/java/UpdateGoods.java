import com.example.servlet_test.model.GoodsModel;
import com.example.servlet_test.utils.UtilsData;

public class UpdateGoods {
    public static void main(String[] args) {
        GoodsModel goodsModel1 = new GoodsModel(2,"df","df",34);
        for (GoodsModel goodsModel : UtilsData.GList) {
            if (goodsModel.getId()==goodsModel1.getId()) {

                goodsModel.setgName(goodsModel1.getgName());
            }
        }
        System.out.println(UtilsData.GList);
    }
}

