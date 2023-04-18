package com.showbie.chatroom.dao;

import com.showbie.chatroom.model.Post;
import com.showbie.chatroom.model.Room;
import com.showbie.chatroom.model.User;

public class PostDao {

	public Post create(User user, String message) {
		Post post = new Post();
		Room room = InMemoryDatabase.getInstance().rooms.get(0);
		post.setPostId(InMemoryDatabase.getInstance().posts.size() + 1L);
		post.setMessage(message);
		post.setUser(user);
		post.setRoom(room);
		InMemoryDatabase.getInstance().posts.add(post);
		room.addPost(post);

		return post;
	}

}
