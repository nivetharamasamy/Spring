package com.kgisl.spring;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

/**
 * controllersql
 */
@Controller
@RequestMapping("/")
public class controllersql {
   private static Connection con;
  
   @RequestMapping(value = "/loadpage") 
   public ModelAndView newcontact(HttpServletRequest request, HttpServletResponse response)
   throws IOException, SQLException {
      ArrayList<pojo> list = new ArrayList<pojo>();
      con =connection.data();
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM form");
      while (rs.next()) {
         pojo p = new pojo();
         p.setUsename(rs.getString("username"));
         p.setEmail(rs.getString("email"));
         p.setPassword(rs.getString("password"));
         p.setPhonenumber(rs.getInt("phonenumber"));
         p.setCity(rs.getString("city"));
         p.setGender(rs.getString("gender"));
         list.add(p);
     }
     return new ModelAndView("index","listm",list); 
    
 
 
   }     
  
   @RequestMapping(value ="/newlogpage")
     public String newone(HttpServletRequest request, HttpServletResponse response){
      return "/new";
       } 
      
       @RequestMapping(value = "/newpage")
       public ModelAndView newoneans(HttpServletRequest request, HttpServletResponse response)
   throws IOException, SQLException {
      String username = request.getParameter("username");
      String email = request.getParameter("email");
     String city=request.getParameter("city");
     String password=request.getParameter("password");
      int phonenumber= Integer.parseInt(request.getParameter("phonenumber"));
      String gender=request.getParameter("gender");
      Statement stmt = con.createStatement();
       stmt.executeUpdate("insert into form(username,email,password,phonenumber,city,gender) values('"+username+"','"+email+"','"+password+"','"+phonenumber+"','"+city+"','"+gender+"')");
      return new ModelAndView("redirect:/loadpage");
   }
   @RequestMapping(value = "/edit")
   public ModelAndView update(@RequestParam("id") String username,HttpServletRequest request, HttpServletResponse response){
      String username1=request.getParameter("id");
      return new ModelAndView("update","update",username1); 
       } 
       @RequestMapping(value = "/updateans")
       public ModelAndView updateans(HttpServletRequest request, HttpServletResponse response)
       throws IOException, SQLException {
         String username = request.getParameter("username");
         String email = request.getParameter("email");
         String password = request.getParameter("password");
        int phonenumber= Integer.parseInt(request.getParameter("phonenumber"));
        String city=request.getParameter("city");
        String gender=request.getParameter("gender");
        Statement stmt = con.createStatement();
       stmt.executeUpdate("UPDATE form SET email ='"+email+"', password='"+password+"',phonenumber='"+phonenumber+"',city='"+city+"',gender='"+gender+"' WHERE username = '"+username+"'");
       return new ModelAndView("redirect:/loadpage");
       }
       @RequestMapping(value = "/delete")
       public ModelAndView delete(@RequestParam("id") String username,HttpServletRequest request, HttpServletResponse response) throws SQLException{
         String username1=request.getParameter("id");
         Statement stmt = con.createStatement();
         stmt.executeUpdate("delete from form where username='"+username1+"'");

         return new ModelAndView("redirect:/loadpage"); 
          } 
      
      }

      
    
