package Servlet;

import Model.ShopModel;
import org.jcp.xml.dsig.internal.dom.Utils;

import javax.rmi.CORBA.Util;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import Utils.UtilsData;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user=req.getSession().getAttribute("user");
        if(user==null){
            req.getRequestDispatcher("/login.html").forward(req,resp);
        }else {

            }
        }

    }

