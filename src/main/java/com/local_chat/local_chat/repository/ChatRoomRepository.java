package com.local_chat.local_chat.repository;

import com.local_chat.local_chat.model.ChatRoom;
import com.local_chat.local_chat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {
    Optional<ChatRoom> findByUserIdCreator(User user);
    ChatRoom findById(int id);
}
