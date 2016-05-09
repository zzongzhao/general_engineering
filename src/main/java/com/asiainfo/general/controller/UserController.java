package com.asiainfo.general.controller;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  


import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  

import com.asiainfo.general.model.UserVO;
import com.asiainfo.general.service.IUserService;
  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        UserVO user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}  
