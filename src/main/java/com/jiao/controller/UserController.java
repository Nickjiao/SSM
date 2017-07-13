package com.jiao.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;  
  
import com.jiao.domain.User;  
import com.jiao.service.UserService;

@Controller  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/")
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }   
    
    @RequestMapping("/login")
    public String getLogin(){      
        return "login";    
    } 
    
    @RequestMapping("/register")
    public String register(){      
        return "register";    
    } 

    @RequestMapping("/check")
    public String check(String username,
    		String password,
    		HttpServletRequest req){ 
    	HttpSession session = req.getSession();
    	session.setAttribute("username", username);
    	return "index";
    } 
    
    @RequestMapping("/tectalk")
    public String tectalk(Model model){  
    	model.addAttribute("date",new Date(System.currentTimeMillis()));
    	model.addAttribute("title_1","dsg");
    	model.addAttribute("author_1","dsg");
    	model.addAttribute("clicknum","dsg");
    	model.addAttribute("replynum","dsg");
    	model.addAttribute("lastreplydate","dsg");
        return "tectalk";    
    } 
}  