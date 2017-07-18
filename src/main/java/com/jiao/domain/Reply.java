package com.jiao.domain;

import java.sql.Timestamp;

public class Reply {
	
	private Integer reply_Id;
	private Integer reply_Pid;
	private Integer reply_Uid;
	private String reply_Uname;
	private Timestamp reply_Cretime;
	private byte[] reply_Content;
	private User user;
	private Post post;

	public Integer getReply_Uid() {
		return reply_Uid;
	}
	public void setReply_Uid(Integer reply_Uid) {
		this.reply_Uid = reply_Uid;
	}
	public Integer getReply_Pid() {
		return reply_Pid;
	}
	public void setReply_Pid(Integer reply_Pid) {
		this.reply_Pid = reply_Pid;
	}
	public Timestamp getReply_Cretime() {
		return reply_Cretime;
	}
	public void setReply_Cretime(Timestamp reply_Cretime) {
		this.reply_Cretime = reply_Cretime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public byte[] getReply_Content() {
		return reply_Content;
	}
	public void setReply_Content(byte[] reply_Content) {
		this.reply_Content = reply_Content;
	}
	public String getReply_Uname() {
		return reply_Uname;
	}
	public void setReply_Uname(String reply_Uname) {
		this.reply_Uname = reply_Uname;
	}
	public Integer getReply_Id() {
		return reply_Id;
	}
	public void setReply_Id(Integer reply_Id) {
		this.reply_Id = reply_Id;
	}

}
