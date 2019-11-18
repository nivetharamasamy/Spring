// package com.kgisl.spring;import java.io.IOException;
// import java.sql.SQLException;
// import java.util.ArrayList;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;
// @Controller
// @RequestMapping("/")
// public class controller {
//     ArrayList<pojo> list=new ArrayList<pojo>();  
//    @RequestMapping(value = "/listall")
//  public String alllist(HttpServletRequest request, HttpServletResponse response){
// return "/index";
//  }
//  @RequestMapping(value = "/newlogpage")
//  public String newpage(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
//  request.getParameter("username");
//  return "/new";
//  }
//  @RequestMapping(value = "/newpage", produces = {
//     "application/JSON"
//     })
//  public ModelAndView newcontact(HttpServletRequest request, HttpServletResponse response)
//  throws IOException, SQLException {
//     String username = request.getParameter("username");
//     String email = request.getParameter("email");
//     String password = request.getParameter("password");
//    int phonenumber= Integer.parseInt(request.getParameter("phonenumber"));
//     System.out.println(username);
//     System.out.println(email);
//     System.out.println(password);
//     System.out.println(phonenumber);
//    pojo p=new pojo(username,email,password,phonenumber);
//     System.out.println(p);
//     list.add(p);
// return new ModelAndView("index","listm",list);
//  }
//  @RequestMapping(value = "/edit", produces = {
//    "application/JSON"
//    })
// public ModelAndView edit(ModelAndView model,@RequestParam("id") String username,HttpServletRequest request, HttpServletResponse response)
// throws IOException, SQLException {
//    String username1 = request.getParameter("id");
// return new ModelAndView("update","update",username1);
// }
// @RequestMapping(value = "/updateans")
// public ModelAndView update(HttpServletRequest request, HttpServletResponse response)
//  throws IOException, SQLException {
//    String username = request.getParameter("username");
//    String email = request.getParameter("email");
//    String password = request.getParameter("password");
//   int phonenumber= Integer.parseInt(request.getParameter("phonenumber"));
//    for (pojo user : list) {
//       if (user.getUsername().equals(username)) {
//         user.setEmail(email);
//         user.setPassword(password);
//         user.setPhonenumber(phonenumber);
//           break;  
//       }
//   }
//   return new ModelAndView("index","listm",list);
//  }
//  @RequestMapping(value = "/delete")
//  public ModelAndView delete(ModelAndView model1,@RequestParam("id") String username,HttpServletRequest request, HttpServletResponse response)
// throws IOException, SQLException {
//    String username1 = request.getParameter("id");
//    for (int i = list.size() - 1; i>=0; i--) {
//       pojo fruit = list.get(i);
//       System.out.println(fruit);
//    if (username1.equals(fruit.username)) {
//           list.remove(fruit);
//       }
//   }
//   return new ModelAndView("index","listm",list);
// }}