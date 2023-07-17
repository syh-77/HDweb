package com.example.servlet_test.constant;



import com.example.servlet_test.model.UserModel;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public class Constant {
    public static final String username="root";
    //
    public static Map<UserModel, HttpSession> map=new HashMap<>();
}
