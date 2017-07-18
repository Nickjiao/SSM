package com.jiao.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiao.dao.PostDao;
import com.jiao.domain.Post;
import com.jiao.domain.Reply;
import com.jiao.domain.User;

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
			byte[]    cont,
			String    ttl) {
		// TODO Auto-generated method stub
		post.addNewPost(userid, cont, ttl);
	}

	@Override
	public Post selectPostByid(int id) {
		// TODO Auto-generated method stub
		return post.selectPostByid(id);
	}

	@Override
	public Post selectPostBytitle(String ttl) {
		// TODO Auto-generated method stub
		return post.selectPostBytitle(ttl);
	}

	@Override
	public Post selectPostBypid(Integer id) {
		// TODO Auto-generated method stub
		return post.selectPostBypid(id);
	}

	@Override
	public List<Post> selectTenPost(Integer start) {
		// TODO Auto-generated method stub
		return post.selectTenPost(start);
	}

	@Override
	public Integer selectPostNum() {
		// TODO Auto-generated method stub
		return post.selectPostNum();
	}

	@Override
	public void updatePostWth(@Param("id") Integer id,
			@Param("num") Integer   num) {
		// TODO Auto-generated method stub
		post.updatePostWth(id,num);
	}

}
