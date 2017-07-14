package com.jiao.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  
  
import com.jiao.domain.User;
import com.jiao.handleCookie.CookieUtil;
import com.jiao.handleCookie.JavaWebToken;
import com.jiao.service.UserService;

@Controller  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/")
    public ModelAndView getIndex(HttpServletRequest req,
    		HttpServletResponse response){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);
        
      //����Ƿ���֮ǰ��Cookie;�У�ɾ�����ޣ���ӡ�
    	if(CookieUtil.getValByName(req,"isLogin") != null) {
    		CookieUtil.deleteCookie(response, "isLogin");
    	}
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
    		HttpServletRequest req,
    		HttpServletResponse response){ 
    	
    	//�˶Գɹ�
    	Map<String, Object> loginInfo = new HashMap<>();
        loginInfo.put("isLogin", "yes!");
        loginInfo.put("timestamp", new Date());
        String sessionId = JavaWebToken.createJavaWebToken(loginInfo);//token���ƣ������뿴������˵������
        CookieUtil.addCookie(response,"isLogin",sessionId);//��cookie
        return "index";//�ض���
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