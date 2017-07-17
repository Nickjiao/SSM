package com.jiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jiao.domain.Post;

@Repository  
public interface PostDao {
	List<Post> selectFirstTenPost();
	
	void addNewPost(
			@Param("userid") Integer   userid,
			@Param("contdep")byte[]    contdep,
			@Param("cont")byte[]    cont,
			@Param("ttl")String    ttl);
	
	Post selectPostByid(int id);
	
	Post selectPostBytitle(String ttl);
	
	Post selectPostBypid(Integer id);
}
