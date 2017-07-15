package com.jiao.domain;
import java.sql.Timestamp;

public class Post {
	private Integer _pid;
	private Integer _userid;
	private Timestamp _cretime;
	private byte[] _contentdep;
	private byte[] _content;
	private String _title;
	private User user;
	
	public Integer get_pid() {
		return _pid;
	}
	public void set_pid(Integer _pid) {
		this._pid = _pid;
	}
	public Integer get_userpid() {
		return _userid;
	}
	public void set_userpid(Integer _userid) {
		this._userid = _userid;
	}
	public Timestamp get_cretime() {
		return _cretime;
	}
	public void set_cretime(Timestamp _cretime) {
		this._cretime = _cretime;
	}
	public byte[] get_contentdep() {
		return _contentdep;
	}
	public void set_contentdep(byte[] _contentdep) {
		this._contentdep = _contentdep;
	}
	public byte[] get_content() {
		return _content;
	}
	public void set_content(byte[] _content) {
		this._content = _content;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
