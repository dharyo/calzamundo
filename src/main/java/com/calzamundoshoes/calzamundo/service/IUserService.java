package com.calzamundoshoes.calzamundo.service;

import java.util.List;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;

import com.calzamundoshoes.calzamundo.entity.User;

public interface IUserService /* extends UserDetailsService */ {

    List<User> getAllUsers();

    User saveUsers(User user);

    User getUserById(Long id);

    User updateUser(User user);

    void deleteUserById(Long id);

}
