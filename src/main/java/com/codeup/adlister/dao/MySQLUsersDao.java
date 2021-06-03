package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to the database!", e);
            }
        }

        @Override
        public User findByUsername (String username){
            String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
            try{
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, username);
            } catch (SQLException e){
            throw new RuntimeException("Error finding a user by username", e);
        }

        @Override
        public Long insert (User user){
            return null;
        }
    }
}
 stmt.setString(stmt.executeQuery());