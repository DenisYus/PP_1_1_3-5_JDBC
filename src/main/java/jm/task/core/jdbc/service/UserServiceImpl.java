package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDaoJDBCImpl userDaoJDBCimpl = new UserDaoJDBCImpl();
    public void createUsersTable() {
        userDaoJDBCimpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBCimpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBCimpl.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoJDBCimpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoJDBCimpl.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoJDBCimpl.cleanUsersTable();
    }
}
