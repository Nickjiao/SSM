package com.jiao.handleInterceptor;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jiao.handleCookie.AuthUtil;
import com.jiao.handleCookie.CookieUtil;

public class HandleInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object obj) throws Exception {
          //拿到cookie
          //也就是获取session里的登录状态值
        String cookie= CookieUtil.getValByName(request,"isLogin");
        if (cookie!=null){
        //session解密
            Map<String,Object> map= AuthUtil.decodeSession(cookie);
            String loginStatus= (String) map.get("isLogin");
            Long timestamp= (Long) map.get("timestamp");
            if (loginStatus!=null&&timestamp!=null&&new Date().getTime()-timestamp<1000*60*60*24*10){
                return true;
            }
        }
        //没有找到登录状态则重定向到登录页，返回false，不执行原来controller的方法
        response.sendRedirect("/SSM/login");
        return false;
    }

}