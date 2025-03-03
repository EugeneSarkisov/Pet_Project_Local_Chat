package com.local_chat.local_chat.repository;

import com.local_chat.local_chat.model.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatroomRepository extends JpaRepository<Chatroom, Integer> {
}
