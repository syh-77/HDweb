package com.example.servlet_test.servlet;

import com.example.servlet_test.model.GoodsModel;
import com.example.servlet_test.utils.UtilsData;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/update")
public class UpdateGoodsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        GoodsModel goodsModel = new GoodsModel();
        try {
            BeanUtils.populate(goodsModel,req.getParameterMap());
            for (GoodsModel model : UtilsData.GList) {
                if (model.getId()==goodsModel.getId()) {
                    model.setgName(goodsModel.getgName());
                    model.setColor(goodsModel.getColor());
                    model.setPrice(goodsModel.getPrice());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
