package com.jiao.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiao.dao.PostDao;
import com.jiao.domain.Post;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostDao post;
	
	@Override
	public List<Post> selectFirstTenPost() {
		// TODO Auto-generated method stub
		List<Post> res = post.selectFirstTenPost();
		return res;
	}
	
	@Override
	public void addNewPost(Integer   userid,
			byte[]    contdep,
			byte[]    cont,
			String    ttl) {
		// TODO Auto-generated method stub
		post.addNewPost(userid, contdep, cont, ttl);
	}

	@Override
	public Post selectPostByid(int id) {
		// TODO Auto-generated method stub
		return post.selectPostByid(id);
	}

}
