package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static final User user1 = new User("Irina", "Avdeeva", (byte) 36);
    private static final User user2 = new User("Evgeniy", "Morozov", (byte) 42);
    private static final User user3 = new User("Vlad", "Carevich", (byte) 3);
    private static final User user4 = new User("Misha", "Bumbosik", (byte) 1);

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
