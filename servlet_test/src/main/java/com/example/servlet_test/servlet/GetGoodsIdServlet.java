package com.example.servlet_test.servlet;

import com.example.servlet_test.model.GoodsModel;
import com.example.servlet_test.utils.UtilsData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getGid")
public class GetGoodsIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int i = Integer.parseInt(id);
        for (GoodsModel goodsModel : UtilsData.GList) {
            if (goodsModel.getId()==i) {
                req.setAttribute("goods",goodsModel);
                req.getRequestDispatcher("/update.jsp").forward(req,resp);
            }
        }
    }
}
