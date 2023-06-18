package com.romansayapin.springBootJPA.dao;


import com.romansayapin.springBootJPA.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUsers(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
