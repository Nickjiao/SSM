package com.jiao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiao.dao.ReplyDao;
import com.jiao.domain.Reply;

@Service  
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyDao replyDao;
	
	@Override
	public void addNewReply(Integer uid, Integer pid, byte[] cont) {
		// TODO Auto-generated method stub
		replyDao.addNewReply(uid, pid, cont);
	}

	@Override
	public List<Reply> selectReplyBypid(Integer id) {
		// TODO Auto-generated method stub
		return replyDao.selectReplyBypid(id);
	}

}
