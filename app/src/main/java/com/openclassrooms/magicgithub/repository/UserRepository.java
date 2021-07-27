package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }
    private List<User> users = generateUsers();

    public List<User> getUsers() {
        // TODO: A modifier
        return users;
    }

    public void generateRandomUser() {
        // TODO: A modifier
        users.add(User.random());
    }

    public void deleteUser(User user) {
        // TODO: A modifier
        this.users.remove(user);
    }
}
