package com.ChatApp.User_Service.service;

import com.ChatApp.User_Service.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    List<User> getAllUsers();
    List<User> getUsersByChatRoom(String chatRoom);
    Optional<User> getUserById(Long id);
    void deleteUser(Long id);
    User updateChatRoom(Long id, String chatRoom);
}
