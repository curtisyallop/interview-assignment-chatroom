package com.showbie.chatroom.service;

import com.showbie.chatroom.dao.PostDao;
import com.showbie.chatroom.dao.RoomDao;
import com.showbie.chatroom.dao.UserDao;
import com.showbie.chatroom.model.Post;
import com.showbie.chatroom.model.User;
import java.util.Collection;

public class ChatroomService {

	private RoomDao roomDao = new RoomDao();
	private UserDao userDao = new UserDao();
	private PostDao postDao = new PostDao();

	public void createChatroom() {
		roomDao.create();
	}

	public User createUser(String name, String userType) {
		return userDao.create(name, userType);
	}

	public void createPost(User user, String message) {
		postDao.create(user, message);
	}

	public Collection<Post> getPosts() {
		return roomDao.getChatroom().getPosts();
	}

}
