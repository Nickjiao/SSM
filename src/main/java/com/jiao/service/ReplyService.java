package com.jiao.service;

import java.util.List;

import com.jiao.domain.Reply;

public interface ReplyService {
	void addNewReply(Integer uid,
			Integer pid,
			byte[] cont);
	List<Reply> selectReplyBypid(Integer id);
}
