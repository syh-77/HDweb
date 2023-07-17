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
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/add")
public class AddGoodsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        GoodsModel goodsModel = new GoodsModel();
        try {
            BeanUtils.populate(goodsModel,req.getParameterMap());
            goodsModel.setId(++UtilsData.gId);
            UtilsData.GList.add(goodsModel);
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.write("<a href=\"/goods\">前往商品列表</a>");
            System.out.println(goodsModel);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
