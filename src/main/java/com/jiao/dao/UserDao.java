package com.jiao.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jiao.domain.User;  

/** 
 * 功能概要：User的DAO类 
 *  
 * @author linbingwen 
 * @since 2015年9月28日 
 */
@Repository  
public interface UserDao {  
    /** 
     *  
     * @author linbingwen 
     * @since 2015年9月28日 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
    
    public User selectPostById(Integer userId);
    
    public Integer selectIdByNamePwd(@Param("name") String userName,
    		@Param("pd") String userPwd);
    
    public void addNewUser(@Param("name") String userName,
    		@Param("pwd") String userPwd,
    		@Param("email") String userEmail);
}
