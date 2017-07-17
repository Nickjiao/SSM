package com.jiao.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  
import com.jiao.dao.UserDao;  
import com.jiao.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserServiceʵ���� 
 *  
 * @author linbingwen 
 * @since  2015��9��28��
 */
@Service  
public class UserServiceImpl implements UserService{  
    @Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }  
    
    public Integer selectIdByNamePwd(@Param("name") String userName,
    		@Param("pd") String userPwd){  
        return userDao.selectIdByNamePwd(userName,userPwd);  
    }

	@Override
	public User selectPostById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectPostById(userId);
	}

	@Override
	public void addNewUser(@Param("name") String userName,
    		@Param("pwd") String userPwd,
    		@Param("email") String userEmail) {
		userDao.addNewUser(userName, userPwd, userEmail);
	}

}  