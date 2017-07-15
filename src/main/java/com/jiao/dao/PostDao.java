package com.jiao.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jiao.domain.Post;

@Repository  
public interface PostDao {
	List<Post> selectFirstTenPost();
}
