package com.ChatApp.User_Service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDTO {

    @NotBlank(message = "username is required")
    @Size(min = 3, max = 30, message = "Username should be between 3 and 30 characters")
    private String username;

    @NotBlank(message = "chatRoom is required")
    private String chatRoom;

    public UserDTO() {
    }

    public UserDTO(String username, String chatRoom) {
        this.username = username;
        this.chatRoom = chatRoom;
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
