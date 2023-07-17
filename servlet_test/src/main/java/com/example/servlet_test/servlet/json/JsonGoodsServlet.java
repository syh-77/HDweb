package com.example.servlet_test.servlet.json;

import com.example.servlet_test.utils.UtilsData;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/queryAll")
public class JsonGoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JSONArray arrays = JSONArray.fromObject(UtilsData.GList);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(arrays.toString());
        resp.getWriter().close();
    }
}
