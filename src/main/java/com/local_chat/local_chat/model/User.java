package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
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
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private UserCred userCred;
    @OneToMany(mappedBy = "userIdSender", fetch = FetchType.EAGER)
    private Collection<Message> userMessages;
    @OneToMany(mappedBy = "userIdCreator", fetch = FetchType.EAGER)
    private Collection<Chatroom> userChatRooms;
}
