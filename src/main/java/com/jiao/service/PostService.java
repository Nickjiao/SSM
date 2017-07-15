package com.jiao.service;

import java.util.List;


import com.jiao.domain.Post;


public interface PostService {
	List<Post> selectFirstTenPost();
}
