package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Denis", "Yusov", (byte) 23);
        userDao.saveUser("Kirill", "Leonchenko", (byte) 25);
        userDao.saveUser("Alena", "Yatsina", (byte) 23);
        userDao.saveUser("Pasha", "Nikiforov", (byte) 24);

        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
