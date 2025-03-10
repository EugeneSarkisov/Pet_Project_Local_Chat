package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Collection<Message> userMessages;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Collection<ChatRoom> userChatRooms;
}
