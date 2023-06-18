package com.romansayapin.springBootJPA.service;


import com.romansayapin.springBootJPA.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUsers(User user);

    User getUser(int ID);

    void updateUser(User user);

    void deleteUser(int ID);
}
