package com.jiao.domain;
import java.sql.Timestamp;
import java.util.List;

public class Post {
	public Integer post_Id;
	private Integer post_Uid;
	private Timestamp post_Cretime;
	public byte[] post_Content;
	public String post_Title;
	private User user;
	private List<Reply> replys;
	private Integer post_ClickNum;
	public Integer getPost_Id() {
		return post_Id;
	}
	public void setPost_Id(Integer post_Id) {
		this.post_Id = post_Id;
	}
	public Integer getPost_Uid() {
		return post_Uid;
	}
	public void setPost_Uid(Integer post_Uid) {
		this.post_Uid = post_Uid;
	}
	public Timestamp getPost_Cretime() {
		return post_Cretime;
	}
	public void setPost_Cretime(Timestamp post_Cretime) {
		this.post_Cretime = post_Cretime;
	}
	public byte[] getPost_Content() {
		return post_Content;
	}
	public void setPost_Content(byte[] post_Content) {
		this.post_Content = post_Content;
	}
	public List<Reply> getReplys() {
		return replys;
	}
	public void setReplys(List<Reply> replys) {
		this.replys = replys;
	}
	public String getPost_Title() {
		return post_Title;
	}
	public void setPost_Title(String post_Title) {
		this.post_Title = post_Title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getPost_ClickNum() {
		return post_ClickNum;
	}
	public void setPost_ClickNum(Integer post_ClickNum) {
		this.post_ClickNum = post_ClickNum;
	}

	
}
