package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chatroom")
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "user_id_creator")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id_creator")
    private User userIdCreator;
    @Column(name = "time_stamp")
    private Date timeStamp;
    @OneToMany(mappedBy = "chatroom", fetch = FetchType.LAZY)
    private Collection<Message> chatRoomMessages;

}
