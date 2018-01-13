package com.jikexuyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;


public class LoginServlet19 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet19() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String returnUrl = request.getParameter("returnUrl");
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("returnUrl:"+returnUrl);
		
		RequestDispatcher requestDispatcher = null;
		
		if(username == null || password ==null){
			request.setAttribute("msg", "用户名或者密码为空");
			requestDispatcher = request.getRequestDispatcher("/19/login.jsp");
			requestDispatcher.forward(request, response);
		}else {
			if(username.equals("123") && password.equals("123")){
				request.getSession().setAttribute("flag", "login_success");
				if (returnUrl !=null) {
					requestDispatcher = request.getRequestDispatcher(returnUrl);
					requestDispatcher.forward(request, response);
					}else {
						requestDispatcher = request.getRequestDispatcher("19/index.jsp");
						requestDispatcher.forward(request, response);
					}
			}else {
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "用户名或者密码错误");
				requestDispatcher =  request.getRequestDispatcher("/19/login.jsp");
				requestDispatcher.forward(request, response);
			}
		}
	}

}
