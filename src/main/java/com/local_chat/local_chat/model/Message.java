package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "user_id_sender")
    int userIdSender;
    @Column(name = "user_id_receiver")
    int userIdReceiver;
    @Column(name = "chatroom_id")
    int chatRoomId;
    @Column(name = "content")
    String content;
}
