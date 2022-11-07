package com.calzamundoshoes.calzamundo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.calzamundoshoes.calzamundo.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    @Query("FROM User u WHERE u.nameUser LIKE :name")
    public List<User> findByNameContaining(@Param("name") String name);

}
