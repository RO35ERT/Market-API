package com.tumbwe.artisanmktplace.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String password;
    private String role;
}
