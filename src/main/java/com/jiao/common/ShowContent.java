package com.jiao.common;

public class ShowContent {
	private String title;
	private String author;
	private Integer clickNum;
	private Integer replyNum;
	private String replyTime;
	private Integer post_id;
	
	public ShowContent(String title,
			String author,
			Integer clickNum,
			Integer replyNum,
			String replyTime,
			Integer post_id){
		this.setTitle(title);
		this.setAuthor(author);
		this.setClickNum(clickNum);
		this.setReplyNum(replyNum);
		this.setReplyTime(replyTime);
		this.setPost_id(post_id);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getClickNum() {
		return clickNum;
	}

	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}

	public Integer getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(Integer replyNum) {
		this.replyNum = replyNum;
	}

	public String getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	public Integer getPost_id() {
		return post_id;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
}
