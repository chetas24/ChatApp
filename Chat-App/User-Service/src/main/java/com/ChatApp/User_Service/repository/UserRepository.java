package com.ChatApp.User_Service.repository;

import com.ChatApp.User_Service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByChatRoom(String chatRoom);
}
