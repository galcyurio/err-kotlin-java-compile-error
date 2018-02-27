package service;

import domain.User;

/**
 * @author galcyurio
 */
public class UserService {

    public User createUser(String id, String password) {
        return new User(id, password);
    }
}
