package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "chatroom")
public class Chatroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "chatroom_id")
    int chatRoomId;
    @Column(name = "user_id_creator")
    int userIdCreator;
    @Column(name = "user_id_invited")
    int userIdInvited;
}
