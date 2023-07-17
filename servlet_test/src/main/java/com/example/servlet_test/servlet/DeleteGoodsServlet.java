package com.example.servlet_test.servlet;

import com.example.servlet_test.model.GoodsModel;
import com.example.servlet_test.utils.UtilsData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

@WebServlet("/delete")
public class DeleteGoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        int i = Integer.parseInt(id);
        Iterator<GoodsModel> iterator = UtilsData.GList.iterator();
        while (iterator.hasNext()) {
            GoodsModel next = iterator.next();
            if (next.getId()==i) {
                iterator.remove();
            }
        }
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("删除成功！！！");

    }
}
