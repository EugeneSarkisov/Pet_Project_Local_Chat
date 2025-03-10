package com.local_chat.local_chat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_creds")
public class UserCred {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

}
