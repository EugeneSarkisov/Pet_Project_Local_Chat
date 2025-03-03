package com.local_chat.local_chat.repository;

import com.local_chat.local_chat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
