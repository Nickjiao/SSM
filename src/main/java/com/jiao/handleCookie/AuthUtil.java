package com.jiao.handleCookie;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//session������
public class AuthUtil {
//����෽���������ֻ��ͻ��˵ģ��Ӷ�ʵ�ֵ�Token���ơ�ʵ������������£�
  private static Map<String, Object> getClientLoginInfo(HttpServletRequest request) throws Exception {
      Map<String, Object> r = new HashMap<>();
      String sessionId = request.getHeader("sessionId");
      if (sessionId != null) {
          r = decodeSession(sessionId);
          return r;
      }
      throw new Exception("session��������");
  }
//����token��ȥ�û�id
  public static Long getUserId(HttpServletRequest request) throws Exception {
      return  Long.valueOf((Integer)getClientLoginInfo(request).get("userId"));

  }

  /**
   * session����
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
