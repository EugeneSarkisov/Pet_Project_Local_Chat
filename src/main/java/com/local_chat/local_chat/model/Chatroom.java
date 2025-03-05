package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "chatroom")
public class Chatroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "user_id_creator")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_creator")
    User userIdCreator;
    @Column(name = "time_stamp")
    Date timeStamp;
    @OneToMany(mappedBy = "chatroom_id", fetch = FetchType.EAGER)
    Collection<Message> chatRoomMessages;

}
