package com.example.servlet_test.servlet;

import com.example.servlet_test.model.UserModel;
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

@WebServlet("/logon")
public class LogonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        UserModel userModel = new UserModel();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        try {
            BeanUtils.populate(userModel,req.getParameterMap());
            boolean flag = true;
            for (UserModel model : UtilsData.uList) {
                if (userModel.getUname().equals(model.getUname())) {
                    flag = false;
                    out.write("用户名已经存在，请重新注册!");
                    break;
                }
            }
            if (flag) {
                userModel.setId(++UtilsData.uId);
                UtilsData.uList.add(userModel);
                out.write("注册成功，请登录!");
            }
        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
