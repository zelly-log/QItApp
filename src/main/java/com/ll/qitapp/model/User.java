package com.ll.qitapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String oauthProvider;

    @Column(unique = true)
    private String oauthId;

    @Column(length = 50)
    private String nickname;

    public User() {} // JPA가 사용할 기본 생성자

}
