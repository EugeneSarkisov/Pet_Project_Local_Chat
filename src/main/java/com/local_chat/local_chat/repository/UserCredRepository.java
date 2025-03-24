package com.local_chat.local_chat.repository;

import com.local_chat.local_chat.model.UserCred;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredRepository extends JpaRepository<UserCred, Integer> {
    Optional<UserCred> findByUsername(String username);
    boolean existsByUsername(String username);
}
