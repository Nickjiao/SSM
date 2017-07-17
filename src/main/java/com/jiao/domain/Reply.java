package com.jiao.domain;

import java.sql.Timestamp;

public class Reply {
	
	private Integer _rid;
	private Integer _pid;
	private Integer _uid;
	private Timestamp _cretime;
	public byte[] _content;
	private User user;
	private Post post;
	

	public Integer get_rid() {
		return _rid;
	}

	public void set_rid(Integer _rid) {
		this._rid = _rid;
	}

	public Integer get_uid() {
		return _uid;
	}

	public void set_uid(Integer _uid) {
		this._uid = _uid;
	}

	public Integer get_pid() {
		return _pid;
	}

	public void set_pid(Integer _pid) {
		this._pid = _pid;
	}

	public Timestamp get_cretime() {
		return _cretime;
	}

	public void set_cretime(Timestamp _cretime) {
		this._cretime = _cretime;
	}

	public byte[] get_content() {
		return _content;
	}

	public void set_content(byte[] _content) {
		this._content = _content;
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

}
