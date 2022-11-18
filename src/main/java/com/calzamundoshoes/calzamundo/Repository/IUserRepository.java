package com.calzamundoshoes.calzamundo.Repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.calzamundoshoes.calzamundo.entity.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    public Optional<User> findByNameUser(String nameUser);
    
}
