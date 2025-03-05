package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_sender")
    User userIdSender;
    @Column(name = "chatroom_id")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "chatroom_id")
    Chatroom chatRoomId;
    @Column(name = "content")
    String content;
    @Column(name = "time_stamp")
    Date timeStamp;

}
