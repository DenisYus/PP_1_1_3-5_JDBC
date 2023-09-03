package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();


        userService.dropUsersTable();
        userService.dropUsersTable();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Denis", "Yusov", (byte) 23);
        userService.saveUser("Kirill", "Leonchenko", (byte) 25);
        userService.saveUser("Alena", "Yatsina", (byte) 23);
        userService.saveUser("Pasha", "Nikiforov", (byte) 24);
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Denis", "Yusov", (byte) 23);
        userService.saveUser("Kirill", "Leonchenko", (byte) 25);
        userService.saveUser("Alena", "Yatsina", (byte) 23);
        userService.saveUser("Pasha", "Nikiforov", (byte) 24);
        //userService.removeUserById(1L);




    }
}
