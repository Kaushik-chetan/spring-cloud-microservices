package com.userapi.model;

import java.util.Date;

public class Post {
	
	private int postId;
	
	private String post;
	
	private Date postDate;
	
	public Post() {
		
	}

	public Post(int postId, String post, Date postDate) {
		super();
		this.postId = postId;
		this.post = post;
		this.postDate = postDate;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
	
	
	

}
