package com.jiao.service;

import org.apache.ibatis.annotations.Param;

import com.jiao.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserService�ӿ��� 
 *  
 * @author linbingwen 
 * @since  2015��9��28��  
 */  
public interface UserService {  
    User selectUserById(Integer userId);
    
    User selectPostById(Integer userId);

    Integer selectIdByNamePwd(@Param("name") String userName,
    		@Param("pd") String userPwd);
}  
