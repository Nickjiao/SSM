package com.jiao.dao;

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
     
}  
