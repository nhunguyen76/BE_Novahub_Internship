package com.journaldev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    description = "Login Servlet", 
    urlPatterns = { "/LoginServlet" }, 
    initParams = { 
        @WebInitParam(name = "user", value = "nhu"), 
        @WebInitParam(name = "password", value = "123")
    })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException {
      //we can create DB connection resource here and set it to Servlet context
      if(getServletContext().getInitParameter("dbURL").equals("jdbc:mysql://localhost/mysql_db") &&
          getServletContext().getInitParameter("dbUser").equals("mysql_user") &&
          getServletContext().getInitParameter("dbUserPwd").equals("mysql_pwd"))
      getServletContext().setAttribute("DB_Success", "True");
      else throw new ServletException("DB Connection error");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//get request parameters for userID and password
    String user = request.getParameter("user");
    String pwd = request.getParameter("pwd");
    
    //get servlet config init params
    String userID = getServletConfig().getInitParameter("user");
    String password = getServletConfig().getInitParameter("password");
    //logging example
    log("User="+user+"::password="+pwd);
    
    if(userID.equals(user) && password.equals(pwd)){
      response.sendRedirect("LoginSuccess.jsp");
    }else{
      RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
      PrintWriter out= response.getWriter();
      out.println("<font color=red>Either user name or password is wrong.</font>");
      rd.include(request, response);
      
    }
	}

}
