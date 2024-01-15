package com.training.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.training.web.model.User;
import com.training.web.service.LoginService;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
@Controller
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	LoginService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    String msg;
    List<User> userList = new ArrayList<>();
    public void init() {
    	msg = "David";
    	userList.add(new User("Mark","pass123","mark@mail.com"));
    	userList.add(new User("Sara","pass456","sara@mail.com"));
    	userList.add(new User("Kevin","pass980","kevin@mail.com"));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello "+msg+" from Servlet!</h1>");
		out.print("</body></html>");*/
		
		request.setAttribute("name", msg);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		//response.sendRedirect("home.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		System.out.println(service.isValidUser(username, password));
		request.setAttribute("name", username);
		request.setAttribute("users", userList);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		
	}

}

// MVC Architecture
// M - Model ( Data )
// V - View ( What the user can see)
// C - Controller ( Interface between model and view)
