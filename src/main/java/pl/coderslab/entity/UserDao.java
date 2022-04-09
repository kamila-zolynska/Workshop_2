package pl.coderslab.entity;

import pl.coderslab.jbcrypt.BCrypt;

public class UserDao {

    private static final String CREATE_USER_QUERY = "INSERT INTO users (email, username, password) " +
            "VALUES (?, ?, ?)";
    private static final String SELECT_USER_BY_ID_QUERY = "SELECT * FROM user WHERE id = ?";
    private static final String UPDATE_USER_QUERY = "UPDATE users SET email = ? WHERE username = ?";
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE username = ?";

    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
