package com.jiao.service;

import org.apache.ibatis.annotations.Param;

import com.jiao.domain.User;  
  
/** 
 * 功能概要：UserService接口类 
 *  
 * @author linbingwen 
 * @since  2015年9月28日  
 */  
public interface UserService {  
    User selectUserById(Integer userId);
    
    User selectPostById(Integer userId);

    Integer selectIdByNamePwd(@Param("name") String userName,
    		@Param("pd") String userPwd);
    
    void addNewUser(@Param("name") String userName,
    		@Param("pwd") String userPwd,
    		@Param("email") String userEmail);
}  
