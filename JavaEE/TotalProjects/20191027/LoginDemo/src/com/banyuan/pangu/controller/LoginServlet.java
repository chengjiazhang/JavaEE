package com.banyuan.pangu.controller;
import com.banyuan.pangu.mapper.Data;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 * @author edz
 */
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String userPassword = req.getParameter("userPassword");
        Boolean flag = false;
        flag = assembleUser(userName, userPassword);
        if (flag) {
            String message = "您好，" + userName + "!";
            req.setAttribute("message", message);
            req.getRequestDispatcher("/jsp/queryData/DrunkDriving.jsp").forward(req, res);
        } else {
            String message = "Sorry," + "请重新输入！" + "用户名：" + userName + "或密码：*****" + "输入错误！";
            req.setAttribute("message", message);
            req.getRequestDispatcher("jsp/comment/error.jsp").forward(req, res);
        }
    }

    private Boolean assembleUser(String userName, String userPassword) {
        Boolean flag = false;
        List list = Data.getData(userName);
        int m = 1, n = 2;
        if (list.get(m).equals(userName) && list.get(n).equals(userPassword)) {
            flag = true;
            System.out.println(list.get(m));
            System.out.println(list.get(n));
            System.out.println(userName);
            System.out.println(userPassword);
        }
        return flag;
    }
}
