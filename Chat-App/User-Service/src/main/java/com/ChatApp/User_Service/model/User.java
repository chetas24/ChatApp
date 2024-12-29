package com.ChatApp.User_Service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "username is required")
    @Size(min = 3, max = 30, message = "Username should be between 3 and 30 characters")
    private String username;

    @NotBlank(message = "chatRoom is required")
    private String chatRoom;

    public User()
    {

    }

    public User(String username, String chatRoom)
    {
        this.username = username;
        this.chatRoom = chatRoom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(String chatRoom) {
        this.chatRoom = chatRoom;
    }
}
