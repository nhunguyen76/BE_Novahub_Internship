package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entities.User;
 
public class UserDAO { 
  static Connection currentCon = null;
  static ResultSet rs = null; 
  
  
  public static User isValid(String username, String password) {
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    PreparedStatement ps = null;
    String query = "select * from user where Username=? and Password=?";
    try {
      currentCon = connectionManager.getConnection();
      ps = currentCon.prepareStatement(query);
      ps.setString(1,username);
      ps.setString(2,password);
      rs = ps.executeQuery();
      if(rs != null && rs.next()){
        User user = new User(rs.getInt("UserId") , rs.getString("Username"),
            rs.getString("Password"),rs.getString("Role"),rs.getInt("Active"));
      return user;    
      }
      else {
        return null;
      }
      
    }catch(Exception ex) {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
    }
    return null;
  }
  
  
}
