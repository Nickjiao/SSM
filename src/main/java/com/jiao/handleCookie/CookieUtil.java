package com.jiao.handleCookie;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	 public static final int TIME = 60 * 60 * 1 * 1;  //1Сʱ���ʱ��
	
	 
	 //���Cookie
	public static void addCookie(HttpServletResponse response,
			String cookieName, 
			String value) {
		
		Cookie cookie = new Cookie(cookieName,value);
		cookie.setPath("/");
		cookie.setMaxAge(TIME);
        response.addCookie(cookie);
	}
	
	
	//ɾ��Cookie
	public static void deleteCookie(HttpServletResponse response,
			String cookieName) {
		Cookie cookie = new Cookie(cookieName,"");
		cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
	}
	
	//��ȡ�û���cookieֵ
    public static String getValByName(HttpServletRequest request, String cookieName) {
        String value = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())) {
                    value = cookie.getValue();
                }
            }
        }
        return value;
    }
    
    public static boolean isLogin(HttpServletRequest request) {
    	//�õ�cookie
        //Ҳ���ǻ�ȡsession��ĵ�¼״ֵ̬
      String cookie= CookieUtil.getValByName(request,"isLoginSSM");
      if (cookie!=null){
      //session����
          Map<String,Object> map= AuthUtil.decodeSession(cookie);
          String loginStatus= (String) map.get("isLoginSSM");
          Long timestamp= (Long) map.get("timestamp");
          if (loginStatus!=null&&timestamp!=null&&new Date().getTime()-timestamp<1000*60*60*24*10){
              return true;
          }
      }
      return false;
  }

}
