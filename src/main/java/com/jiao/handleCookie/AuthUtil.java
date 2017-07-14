package com.jiao.handleCookie;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//session工具类
public class AuthUtil {
//这个类方法是面向手机客户端的，从而实现的Token机制。实现请见上述文章：
  private static Map<String, Object> getClientLoginInfo(HttpServletRequest request) throws Exception {
      Map<String, Object> r = new HashMap<>();
      String sessionId = request.getHeader("sessionId");
      if (sessionId != null) {
          r = decodeSession(sessionId);
          return r;
      }
      throw new Exception("session解析错误");
  }
//根据token拿去用户id
  public static Long getUserId(HttpServletRequest request) throws Exception {
      return  Long.valueOf((Integer)getClientLoginInfo(request).get("userId"));

  }

  /**
   * session解密
   */
  public static Map<String, Object> decodeSession(String sessionId) {
      try {
          return JavaWebToken.verifyJavaWebToken(sessionId);
      } catch (Exception e) {
          System.err.println("");
          return null;
      }
  }
}
