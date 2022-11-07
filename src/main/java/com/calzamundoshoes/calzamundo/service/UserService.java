package com.calzamundoshoes.calzamundo.service;

import java.util.List;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.calzamundoshoes.calzamundo.Repository.IUserRepository;
import com.calzamundoshoes.calzamundo.entity.User;

@Service
public class UserService implements IUserService {

    private IUserRepository usersRepository;

    public UserService(IUserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    /*
     * @Override
     * public UserDetails loadUserByUsername(String username) throws
     * UsernameNotFoundException {
     * User user = usersRepository.findByEmail(username);
     * 
     * 
     * if (user == null) {
     * throw new UsernameNotFoundException("Usuario o contraseña inválidos");
     * }
     * return new user;
     * 
     * }
     */

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public User saveUsers(User User) {
        return usersRepository.save(User);
    }

    @Override
    public User getUserById(Long id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return usersRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        usersRepository.deleteById(id);
    }
    /*
     * @Override
     * public UserDetails loadUserByUsername(String username) throws
     * UsernameNotFoundException {
     * // TODO Auto-generated method stub
     * return null;
     * }
     */

}
