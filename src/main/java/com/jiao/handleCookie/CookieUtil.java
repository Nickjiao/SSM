package com.jiao.handleCookie;

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

}
