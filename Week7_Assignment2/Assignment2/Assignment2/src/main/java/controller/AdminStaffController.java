package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.cj.api.Session;

import dao.StaffDAO;
import entities.Staff;

@Controller
public class AdminStaffController {
  
  
  /*public String test() {
    return "redirect:www.google.com.vn";
  }*/
  
  
  @RequestMapping("/admin/staff")
  public String getAllList(Model model) {
    List<Staff> listStaff = new ArrayList<Staff>();
    listStaff = StaffDAO.getAll();
    model.addAttribute("listStaff", listStaff);    
    return "/WEB-INF/views/admin/ListStaff.jsp";   
  }
  @RequestMapping("/admin/staff/addForm")
  public String addForm() {   
    return "/WEB-INF/views/admin/FormAddStaff.jsp";   
  }
  
  @RequestMapping(value = "/admin/staff/editForm", method= RequestMethod.GET)
  public String editForm() {   
    return "/WEB-INF/views/admin/FormEditStaff.jsp";   
  }
}
