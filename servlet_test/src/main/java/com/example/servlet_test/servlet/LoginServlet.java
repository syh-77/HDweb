package com.example.servlet_test.servlet;

import com.example.servlet_test.constant.Constant;
import com.example.servlet_test.model.UserModel;
import com.example.servlet_test.utils.UtilsData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        List<UserModel> uList = UtilsData.uList;
        for (UserModel userModel : uList) {
            if (userModel.getUname().equals(uname) && userModel.getPwd().equals(pwd)) {
                //判断map里面是否存在改用户
                if(Constant.map.containsKey(userModel)){
                    HttpSession httpSession = Constant.map.get(userModel);
                    httpSession.invalidate();//让上一个session失效
                    Constant.map.remove(userModel);
                }
                //用户保存在session
                HttpSession session = req.getSession();
                session.setAttribute("user",userModel);
                //用户保存在map
                Constant.map.put(userModel,session);
                break;
            }
        }
        req.getRequestDispatcher("/user_cart.html").forward(req,resp);
    }

}
