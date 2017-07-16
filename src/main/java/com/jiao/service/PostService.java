package com.jiao.service;

import java.sql.Timestamp;
import java.util.List;


import com.jiao.domain.Post;


public interface PostService {
	List<Post> selectFirstTenPost();
	void addNewPost(
			Integer   userid,
			byte[]    contdep,
			byte[]    cont,
			String    ttl);
	Post selectPostByid(int id);
}
