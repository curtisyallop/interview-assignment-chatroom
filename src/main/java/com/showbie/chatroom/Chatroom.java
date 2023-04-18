package com.showbie.chatroom;

import com.showbie.chatroom.dao.InMemoryDatabase;
import com.showbie.chatroom.model.Post;
import com.showbie.chatroom.model.Room;
import com.showbie.chatroom.model.Student;
import com.showbie.chatroom.model.Teacher;
import com.showbie.chatroom.model.User;
import com.showbie.chatroom.service.ChatroomService;
import java.util.ArrayList;
import java.util.Collection;

public class Chatroom {

	public static void main(String[] args) {
		ChatroomService service = new ChatroomService();
		service.createChatroom();

		User teacher = service.createUser("Teacher", "T");
		User student = service.createUser("Student", "S");

		service.createPost(teacher, "Message 1: Hello, Student!");
		service.createPost(student, "Reply 1: Hi, Teacher!");
		service.createPost(teacher, "Message 2: Please answer the following question: 2^5 = ?");
		service.createPost(student, "Reply 2: 32");
		service.createPost(teacher, "Message 3: Correct");
		service.createPost(student, "Reply 3: Thank you");
		updateLatestPost("Reply 3: Thank you, Teacher");

		printUsers();
		System.out.println();
		printChatroomMessages(service.getPosts());
	}

	private static void updateLatestPost(String message) {
		Room chatroom = InMemoryDatabase.getInstance().rooms.get(0);
		Post latestPost = new ArrayList<>(chatroom.getPosts()).get(chatroom.getPosts().size() - 1);
		latestPost.setMessage(message);
	}

	private static void printUsers() {
		System.out.println("Users:");
		for (User user : InMemoryDatabase.getInstance().users) {
			if (user.getUserType().equals("T")) {
				System.out.println(((Teacher)user).getName() + " (" + user.getUserType() + ")");
			} else {
				System.out.println(((Student)user).getName() + " (" + user.getUserType() + ")");
			}
		}
	}

	private static void printChatroomMessages(Collection<Post> posts) {
		System.out.println("Messages:");
		for (Post post : posts) {
			if (post.getUser().getUserType().equals("T")) {
				System.out.println(((Teacher)post.getUser()).getName() + ": " + post.getMessage());
			} else {
				System.out.println(((Student)post.getUser()).getName() + ": " + post.getMessage());
			}
		}
	}

}
