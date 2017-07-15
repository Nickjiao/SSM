package com.jiao.domain;
import java.util.List;

public class User {  
    private Integer userId;  
    private String userName;  
    private String userPassword;  
    private String userEmail;  
    private String userRegtimestamp;  
    private List<Post> posts;
    
    public Integer getUserId() {  
        return userId;  
    }  
  
    public void setUserId(Integer userId) {  
        this.userId = userId;  
    }  
  
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
  
    public String getUserPassword() {  
        return userPassword;  
    }  
  
    public void setUserPassword(String userPassword) {  
        this.userPassword = userPassword;  
    }  
  
    public String getUserEmail() {  
        return userEmail;  
    }  
  
    public void setUserEmail(String userEmail) {  
        this.userEmail = userEmail;  
    }  
  
    @Override  
    public String toString() {  
        return "User [userId=" + userId + ", userName=" + userName  
                + ", userPassword=" + userPassword + ", userEmail=" + userEmail  
                + "]";  
    }

	public String getUserRegtimestamp() {
		return userRegtimestamp;
	}

	public void setUserRegtimestamp(String userRegtimestamp) {
		this.userRegtimestamp = userRegtimestamp;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}  
      
}  
