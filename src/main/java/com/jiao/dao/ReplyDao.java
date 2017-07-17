package com.jiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jiao.domain.Reply;

@Repository  
public interface ReplyDao {
	void addNewReply(@Param("uid") Integer uid,
			@Param("pid")  Integer pid,
			@Param("cont") byte[] cont);
	
	List<Reply> selectReplyBypid(Integer id);
}
