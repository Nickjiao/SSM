package com.jiao.domain;
import java.util.List;

public class User {  
    private Integer user_Id;  
    private String user_Name;  
    private String user_Pwd;  
    private String user_Email;  
    private String user_Regtime;  
    private List<Post> posts;
	public Integer getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(Integer user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Pwd() {
		return user_Pwd;
	}
	public void setUser_Pwd(String user_Pwd) {
		this.user_Pwd = user_Pwd;
	}
	public String getUser_Regtime() {
		return user_Regtime;
	}
	public void setUser_Regtime(String user_Regtime) {
		this.user_Regtime = user_Regtime;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}  
