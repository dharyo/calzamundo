package com.calzamundoshoes.calzamundo.entity;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "username")
    private String nameUser;


    @Column(name = "name_emp")
    private String nameEmployee;

    @Column(name = "password")
    private String passwordEmployee;

    @Column(name = "enable")
    private boolean enable;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="authorities_users",
    joinColumns=@JoinColumn(name="usuario_id"),
    inverseJoinColumns=@JoinColumn(name="authority_id"))
    private Set<Authority> authority;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idUser == null) ? 0 :idUser.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (idUser == null) {
            if (other.idUser != null)
                return false;
            } else if (!idUser.equals(other.idUser))
                return false;
            return true;
}
}
