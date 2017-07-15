package com.jiao.service;

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

}
