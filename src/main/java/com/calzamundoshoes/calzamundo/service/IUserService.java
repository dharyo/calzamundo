package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.User;

public interface IUserService {

    List<User> getAllCustomers();

    User saveCustomers(User customer);

    User getCustomerById(Long id);

    User updateCustomer(User customer);

    void deleteCustomerById(Long id);

}
