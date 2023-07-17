package Servlet;

import Model.ShopModel;
import org.jcp.xml.dsig.internal.dom.Utils;

import javax.rmi.CORBA.Util;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import Utils.UtilsData;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user=req.getSession().getAttribute("user");
        if(user==null){
            req.getRequestDispatcher("/login.html").forward(req,resp);
        }else {
            UtilsData.main();
            List<ShopModel> sList = UtilsData.SList;
            PrintWriter out=resp.getWriter();
            out.write("<html>");
            out.write("<body>");
            out.write("<table>");
            out.write("<tr>");
            out.write("<th>商品id</th>");
            out.write("<th>介绍文本</th>");
            out.write("<th>商品数量</th>");
            out.write("<th>商品价格</th>");
            out.write("<t/r>");
            for(ShopModel shopsModel:sList) {
                out.write("<tr>");
                out.write("<td>"+shopsModel.getPid());
                out.write("<td>"+shopsModel.getShowTxt());
                out.write("<td>"+shopsModel.getNumber());
                out.write("<td>"+shopsModel.getPrice());
                out.write("</tr>");
            }
            out.write("</table>");
            out.write("</body>");
            out.write("</html>");
            }
        }

    }

