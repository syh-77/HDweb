package com.example.servlet_test.servlet;

import com.example.servlet_test.model.GoodsModel;
import com.example.servlet_test.utils.UtilsData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/goods")
public class GoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user = req.getSession().getAttribute("user");
        if (user==null) {
            req.getRequestDispatcher("/login.html").forward(req,resp);
        } else {
            List<GoodsModel> gList = UtilsData.GList;
            req.setAttribute("gList",gList);
            req.getRequestDispatcher("/goods.jsp").forward(req,resp);
//            resp.setContentType("text/html;charset=utf-8");
//            PrintWriter out = resp.getWriter();
//            out.write("<html>");
//            out.write("<body>");
//            out.write("<table>");
//            out.write("<tr>");
//            out.write("<th>商品id</th>");
//            out.write("<th>商品名</th>");
//            out.write("<th>商品颜色</th>");
//            out.write("<th>商品价格</th>");
//            out.write("</tr>");
//            for (GoodsModel goodsModel : gList) {
//                out.write("<tr>");
//                out.write("<td>"+goodsModel.getId()+"</td>");
//                out.write("<td>"+goodsModel.getgName()+"</td>");
//                out.write("<td>"+goodsModel.getColor()+"</td>");
//                out.write("<td>"+goodsModel.getPrice()+"</td>");
//                out.write("</tr>");
//            }
//            out.write("</table>");
//            out.write("</body>");
//            out.write("</html>");
        }
    }
}
