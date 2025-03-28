package com.local_chat.local_chat.repository;

import com.local_chat.local_chat.model.ChatRoom;
import com.local_chat.local_chat.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    List<Message> findMessagesByChatRoomId(Optional<ChatRoom> chatRoom);
}
