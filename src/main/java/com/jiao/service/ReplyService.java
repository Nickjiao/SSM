package com.jiao.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiao.domain.Reply;

public interface ReplyService {
	void addNewReply(@Param("uid") Integer uid,
			@Param("uname")String uname,
			@Param("pid")  Integer pid,
			@Param("cont") byte[] cont);
	List<Reply> selectReplyBypid(Integer id);
}
