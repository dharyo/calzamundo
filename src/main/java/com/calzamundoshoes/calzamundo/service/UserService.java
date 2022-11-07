package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.calzamundoshoes.calzamundo.Repository.IUserRepository;
import com.calzamundoshoes.calzamundo.entity.User;

@Service
public class UserService implements IUserService {

    private IUserRepository usersRepository;

    public UserService(IUserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> getAllCustomers() {
        return usersRepository.findAll();
    }

    @Override
    public User saveCustomers(User customer) {
        return usersRepository.save(customer);
    }

    @Override
    public User getCustomerById(Long id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public User updateCustomer(User customer) {
        return usersRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        usersRepository.deleteById(id);
    }

}
