package com.meimei.controller;

import com.meimei.entity.User;
import com.meimei.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/toUpdate")
public class UserToUpdateServlet extends HttpServlet {
    private UserService userService=new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr=request.getParameter("id");
        User user=userService.getUserById(Integer.valueOf(idStr));
        request.setAttribute("user",user);
        response.sendRedirect("/userUpdate.jsp");
    }
}
