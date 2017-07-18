package com.jiao.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiao.dao.ReplyDao;
import com.jiao.domain.Reply;

@Service  
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyDao replyDao;
	
	@Override
	public void addNewReply(@Param("uid") Integer uid,
			@Param("uname")String uname,
			@Param("pid")  Integer pid,
			@Param("cont") byte[] cont) {
		replyDao.addNewReply(uid, uname, pid, cont);
	}

	@Override
	public List<Reply> selectReplyBypid(Integer id) {
		// TODO Auto-generated method stub
		return replyDao.selectReplyBypid(id);
	}

}
