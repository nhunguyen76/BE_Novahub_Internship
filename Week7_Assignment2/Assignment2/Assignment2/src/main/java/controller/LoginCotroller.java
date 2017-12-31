package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dao.UserDAO;
import entities.User;

@Controller
@WebServlet(name = "LoginServlet", urlPatterns = { "/LoginServlet" })
public class LoginCotroller extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String username = request.getParameter("username");
    String password = request.getParameter("pwd");
    String errorMsg = null;
    User user = null;
    if(username == null || username.equals("")){
      errorMsg ="Username can't be null or empty";
    }
    if(password == null || password.equals("")){
      errorMsg = "Password can't be null or empty";
    }
    if(errorMsg != null) {
      RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/Login.jsp");
      PrintWriter out= response.getWriter();
      out.println("<font color=red>"+errorMsg+"</font>");
      rd.include(request, response);
    }else{
      user = UserDAO.isValid(username, password);
      if(user != null ){
        HttpSession session = request.getSession(true);      
        session.setAttribute("currentSessionUser",user); 
        request.getRequestDispatcher("/WEB-INF/views/admin/indexAdmin.jsp").forward(request, response);
      }else{
        errorMsg = "Khong ton tai tai khoan nay";
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/Login.jsp");
        PrintWriter out= response.getWriter();
        out.println("<font color=red>"+errorMsg+"</font>");
        rd.include(request, response);
        }
      
    }
  }
  
}
