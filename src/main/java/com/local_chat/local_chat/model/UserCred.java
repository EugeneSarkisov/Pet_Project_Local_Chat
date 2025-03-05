package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "user_creds")
public class UserCred {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "user_id")
    @OneToOne(optional = false, mappedBy = "user_creds")
    User userId;
    @Column(name = "username")
    String username;
    @Column(name = "password")
    String password;

}
