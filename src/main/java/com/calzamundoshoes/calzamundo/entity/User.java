package com.calzamundoshoes.calzamundo.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "name_user")
    private String nameUser;

    @Column(name = "role_user")
    private String roleUser;

    @Column(name = "name_emp")
    private String nameEmployee;

    @Column(name = "password_emp")
    private String passwordEmployee;

}
