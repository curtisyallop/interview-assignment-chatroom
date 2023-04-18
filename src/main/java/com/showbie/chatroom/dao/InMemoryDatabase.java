package com.showbie.chatroom.dao;

import com.showbie.chatroom.model.Post;
import com.showbie.chatroom.model.Room;
import com.showbie.chatroom.model.User;
import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {

	private static InMemoryDatabase instance = new InMemoryDatabase();

	public static InMemoryDatabase getInstance() {
		return instance;
	}

	public List<Post> posts = new ArrayList<>();
	public List<User> users = new ArrayList<>();
	public List<Room> rooms = new ArrayList<>();

}
