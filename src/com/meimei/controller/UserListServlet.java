package com.meimei.controller;

import com.meimei.entity.User;
import com.meimei.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userList")
public class UserListServlet extends HttpServlet {
    UserService userservice=new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list=userservice.list();
        request.setAttribute("list",list);
        request.getRequestDispatcher("/userList.jsp").forward(request,response);
    }
}
