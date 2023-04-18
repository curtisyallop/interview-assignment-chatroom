# interview-assignment-chatroom

## Github repo setup steps

Clone this repository.

Create a new private repository (not publicly visible) in your own account called "interview-assignment-chatroom".

Grant access to 2 github users: curtisyallop and tapanShowbie

Push the code to your new repository:

```
git remote set-url origin git@github.com:YourGitUsername/interview-assignment-chatroom.git
git push -u origin master
```

## Prerequisites

Install maven. IntelliJ UI recommended. Java 11.

## To build and run this app

```
mvn package
java -jar target/chatroom-1.jar
```

## Tasks

1. Add a new method which searches for a substring in the post-messages:

ChatroomService.getFilteredPosts(String searchText)

2. Add a CreatedTimestamp field to post and filter posts from newest to oldest, as returned from ChatroomService.getPosts().

3. Make TeacherStudentRoom : Where a particular teacher and a particular student can have a one-on-one chat.

This should involve service and model changes. Please add unit tests.

Add some sample conversation lines between the teacher and the student in the "main" method.

In addition to the current output, also print out the messages in the new one-on-one chat. Format "<name>: <message>".
Before the one-on-one chat messages, output "One-on-one Chat Room:". Put it between the "Messages:" and "Users:" sections.

Bonus: Refactor the existing code in a couple ways to make it cleaner.

4. Remember to commit and push your final work. Notify us that it is ready.

## Evaluation Criteria

- Clean and concise code
- Good commit message(s)
- Correct logic
- Runs successfully (run via the `java -jar..` line above)
- Tests present (run via `mvn test`)
