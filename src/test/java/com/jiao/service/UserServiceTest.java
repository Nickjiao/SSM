package com.jiao.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
  
import com.jiao.baseTest.SpringTestCase;
import com.jiao.domain.Post;
import com.jiao.domain.User;  
  
/** 
 * 功能概要：UserService单元测试 
 *  
 * @author linbingwen 
 * @since  2015年9月28日  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10);  
        user = userService.selectPostById(0);
        List<Post> p = user.getPosts();
        for(Post pp:p) {
        	System.out.println(pp.get_title());
        	String s;
			try {
				s = new String(pp.get_content(),"utf-8");
				System.out.println(s);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        logger.debug("查找结果" + user);  
    }  

  
}  