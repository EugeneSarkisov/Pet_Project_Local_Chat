package com.local_chat.local_chat.repository;

import com.local_chat.local_chat.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
