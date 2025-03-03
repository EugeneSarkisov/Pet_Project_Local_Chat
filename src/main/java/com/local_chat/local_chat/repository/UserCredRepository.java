package com.local_chat.local_chat.repository;

import com.local_chat.local_chat.model.UserCred;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredRepository extends JpaRepository<UserCred, Integer> {
}
