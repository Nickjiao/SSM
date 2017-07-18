package com.jiao.service;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiao.domain.User;
import com.jiao.domain.Post;
import com.jiao.domain.Reply;


public interface PostService {
	List<Post> selectFirstTenPost();
	
	void addNewPost(
			@Param("userid") Integer   userid,
			@Param("cont")byte[]    cont,
			@Param("ttl")String    ttl);
	
	Post selectPostByid(int id);
	
	Post selectPostBytitle(String ttl);
	
	Post selectPostBypid(Integer id);
	
	List<Post> selectTenPost(Integer start);
	
	Integer selectPostNum();
	
	void updatePostWth(@Param("id") Integer id,
			@Param("num") Integer   num);
}
