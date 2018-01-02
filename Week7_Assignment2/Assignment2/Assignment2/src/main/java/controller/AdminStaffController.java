package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import dao.StaffDAO;
import entities.Staff;

@Controller
@RequestMapping("/admin/staff")
public class AdminStaffController extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  /*public String test() {
    return "redirect:www.google.com.vn";
  }*/
  
  
  @RequestMapping("")
  public String getAllList(Model model) {
    List<Staff> listStaff = new ArrayList<Staff>();
    listStaff = StaffDAO.getAll();
    model.addAttribute("listStaff", listStaff);    
    return "/WEB-INF/views/admin/ListStaff.jsp";   
  }
  @RequestMapping("addForm")
  public String addForm() {   
    return "/WEB-INF/views/admin/FormAddStaff.jsp";   
  }
  
  @RequestMapping(value = {"editForm","editForm/"}, method= RequestMethod.GET)
  public String editForm(@RequestParam("id") String id, Model model) {   
    Staff staff = StaffDAO.getStaff(Integer.parseInt(id));
    model.addAttribute("staff", staff);
    return "/WEB-INF/views/admin/FormEditStaff.jsp";   
  }
  @RequestMapping(value = "edit")
  public void edit(Model model,HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{   
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String errorMsg = null;
    int staffId = Integer.parseInt(request.getParameter("staffId"));
    String name = request.getParameter("name");
    int birthYear = Integer.parseInt(request.getParameter("birthYear"));
    String country = request.getParameter("country");
    String department = request.getParameter("department");
    String position = request.getParameter("position");
    int workDays = Integer.parseInt(request.getParameter("workDays"));
    int allowance = Integer.parseInt(request.getParameter("allowance"));
    float coefficientSalary = Float.parseFloat(request.getParameter("coefficientSalary"));
    Staff staff = new Staff(staffId, name, birthYear, country, department, position, 
        workDays, allowance, coefficientSalary);
    int status = StaffDAO.editStaffInfo(staff);
    if(status != 0) {
      errorMsg= "Chinh sua thanh cong";
    }else {
      errorMsg= "Loi ! CHua chinh sua duoc";
    }
    staff = StaffDAO.getStaff(staffId);
    model.addAttribute("staff", staff);
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out= response.getWriter();
    out.println("<script type=\"text/javascript\">");
    out.println("alert('"+ errorMsg +"');");
    out.println("location='editForm?id="+staff.getStaffId()+"';");
    out.println("</script>");
  }
}
