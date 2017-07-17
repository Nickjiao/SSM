package com.jiao.service;

import java.sql.Timestamp;
import java.util.List;

import com.jiao.domain.User;
import com.jiao.domain.Post;
import com.jiao.domain.Reply;


public interface PostService {
	List<Post> selectFirstTenPost();
	
	void addNewPost(
			Integer   userid,
			byte[]    contdep,
			byte[]    cont,
			String    ttl);
	
	Post selectPostByid(int id);
	
	Post selectPostBytitle(String ttl);
	
	Post selectPostBypid(Integer id);
}
