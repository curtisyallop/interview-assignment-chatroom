package com.showbie.chatroom.dao;

import com.showbie.chatroom.model.Student;
import com.showbie.chatroom.model.Teacher;
import com.showbie.chatroom.model.User;

public class UserDao {

	public User create(String name, String userType) {
		if (userType.equals("T")) {
			Teacher teacher = new Teacher();
			teacher.setUserId(InMemoryDatabase.getInstance().users.size() + 1L);
			teacher.setName(name);
			teacher.setUserType(userType);
			InMemoryDatabase.getInstance().users.add(teacher);

			return teacher;
		} else {
			Student student = new Student();
			student.setUserId(InMemoryDatabase.getInstance().users.size() + 1L);
			student.setName(name);
			student.setUserType(userType);
			InMemoryDatabase.getInstance().users.add(student);

			return student;
		}
	}

}
