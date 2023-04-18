package com.showbie.chatroom.service;

import com.showbie.chatroom.model.Post;
import com.showbie.chatroom.model.Teacher;
import com.showbie.chatroom.model.User;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ChatroomServiceTest {

	@Test
	public void testGetPosts() {
		ChatroomService service = new ChatroomService();
		service.createChatroom();
		User teacher = service.createUser("Teacher", "T");
		User student = service.createUser("Student", "S");

		service.createPost(teacher, "Message 1: Hello, Student!");
		service.createPost(student, "Reply 1: Hi, Teacher!");

		List<Post> posts = service.getPosts().stream().collect(Collectors.toList());
		assertEquals(2, posts.size());
		assertEquals("Teacher", ((Teacher) posts.get(0).getUser()).getName());
		assertEquals("Message 1: Hello, Student!", posts.get(0).getMessage());
	}

}