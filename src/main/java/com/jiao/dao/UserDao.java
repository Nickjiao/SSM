package com.jiao.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jiao.domain.User;  

/** 
 * ���ܸ�Ҫ��User��DAO�� 
 *  
 * @author linbingwen 
 * @since 2015��9��28�� 
 */
@Repository  
public interface UserDao {  
    /** 
     *  
     * @author linbingwen 
     * @since 2015��9��28�� 
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
