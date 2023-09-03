package jm.task.core.jdbc.dao;





import com.mysql.cj.protocol.Resultset;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao  {
    /*private final Connection connection = getConnection();
*/
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
       /* try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS User " +
                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), lastName VARCHAR(255), age INT)");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    public void dropUsersTable() {
        /*try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("DROP TABLE IF EXISTS User");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException  {
        /*PreparedStatement preparedStatement = null;
        try {
            connection.setAutoCommit(false);
            preparedStatement= connection.prepareStatement("INSERT INTO User (name, lastName, age) VALUES (?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setByte(3, age);
            preparedStatement.execute();
            System.out.println("Пользователь с именем " + name + " добавлен в базу данных.");
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);

        }*/
    }


    public void removeUserById(long id) throws SQLException {
        /*try {
            connection.setAutoCommit(false);
            PreparedStatement pst = connection.prepareStatement("DELETE FROM User WHERE id = ?");
            pst.setLong(1, id);
            pst.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }*/
    }

    public List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();/*
        String sql = "SELECT * FROM User";
        Statement statement = null;
        try {
            statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                    User user = new User();
                    user.setId(resultSet.getLong("id"));
                    user.setName(resultSet.getString("name"));
                    user.setLastName(resultSet.getString("lastName"));
                    user.setAge(resultSet.getByte("age"));
                    userList.add(user);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
*/
        return userList;
    }

    public void cleanUsersTable() throws SQLException {
        /*try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.executeUpdate("TRUNCATE TABLE User");
            connection.commit();

        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);

        }*/
    }
}
