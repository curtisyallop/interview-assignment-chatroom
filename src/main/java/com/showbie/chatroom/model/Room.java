package com.showbie.chatroom.model;

import java.util.ArrayList;
import java.util.Collection;

public class Room {

	private Long roomId;
	private Collection<Post> posts = new ArrayList<>();

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	public void addPost(Post post) {
		posts.add(post);
	}

}
