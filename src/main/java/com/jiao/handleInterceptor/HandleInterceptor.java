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
          //�õ�cookie
          //Ҳ���ǻ�ȡsession��ĵ�¼״ֵ̬
        String cookie= CookieUtil.getValByName(request,"isLogin");
        if (cookie!=null){
        //session����
            Map<String,Object> map= AuthUtil.decodeSession(cookie);
            String loginStatus= (String) map.get("isLogin");
            Long timestamp= (Long) map.get("timestamp");
            if (loginStatus!=null&&timestamp!=null&&new Date().getTime()-timestamp<1000*60*60*24*10){
                return true;
            }
        }
        //û���ҵ���¼״̬���ض��򵽵�¼ҳ������false����ִ��ԭ��controller�ķ���
        response.sendRedirect("/SSM/login");
        return false;
    }

}