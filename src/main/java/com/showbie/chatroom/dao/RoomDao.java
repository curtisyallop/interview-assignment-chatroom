package com.showbie.chatroom.dao;

import com.showbie.chatroom.model.Room;

public class RoomDao {

	public Room create() {
		Room room = new Room();
		room.setRoomId(InMemoryDatabase.getInstance().rooms.size() + 1L);
		InMemoryDatabase.getInstance().rooms.add(room);

		return room;
	}

	public Room getChatroom() {
		return InMemoryDatabase.getInstance().rooms.get(0);
	}

}
