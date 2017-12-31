package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Staff;

public class StaffDAO {
  static Connection currentCon = null;
  static ResultSet rs = null;
  static String sql = "";
  
  public static List<Staff> getAll(){
    sql = "select * from staff";
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    Statement stmt = null;
    List<Staff> list = new ArrayList<Staff>();
    try {
      currentCon = connectionManager.getConnection();
      stmt = currentCon.createStatement( );
      rs = stmt.executeQuery(sql);
      while(rs.next()) {
        int staffId = rs.getInt("StaffId");
        String name = rs.getString("Name");
        int birthYear = rs.getInt("BirthYear");
        String country = rs.getString("Country");
        String department = rs.getString("Department");
        String position = rs.getString("Position");
        int workDays = rs.getInt("WorkDays");
        int allowance = rs.getInt("Allowance");
        float coefficientSalary = rs.getFloat("CoefficientSalary");
        Staff staff = new Staff(staffId, name, birthYear, country, department, position, workDays, allowance, coefficientSalary);
        list.add(staff);
      }
      return list;
    }catch(SQLException ex) {
      System.out.println(ex);
    }catch(NullPointerException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public static Staff getStaff(int id) {
    sql = "select * from staff where StaffId="+id;
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    Statement stmt = null;
    Staff staff = null;
    try {
      currentCon = connectionManager.getConnection();
      stmt = currentCon.createStatement( );
      rs = stmt.executeQuery(sql);
      while(rs.next()) {
        int staffId = rs.getInt("StaffId");
        String name = rs.getString("Name");
        int birthYear = rs.getInt("BirthYear");
        String country = rs.getString("Country");
        String department = rs.getString("Department");
        String position = rs.getString("Position");
        int workDays = rs.getInt("WorkDays");
        int allowance = rs.getInt("Allowance");
        float coefficientSalary = rs.getFloat("CoefficientSalary");
        staff = new Staff(staffId, name, birthYear, country, department, position, workDays, allowance, coefficientSalary);     
      }
      return staff;
    }catch(SQLException ex) {
      System.out.println(ex);
    }catch(NullPointerException e) {
      e.printStackTrace();
  }
  return null;
  }
}
