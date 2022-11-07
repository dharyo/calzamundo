package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.Customer;

public interface ICustomerService {
    List<Customer> getAllCustomers();

    List<Customer> getCustomersByNombreCustomer(String name);

    List<Customer> getCustomersByLastNameCustomers(String surname);

    List<Customer> getCustomersByIdentificacion(String id);

    Customer saveCustomer(Customer customer);

    Customer getCustomerByIdCustomer(Long id);

    Customer updateCustomer(Customer customer);

    void deleteCustomerById(Long id);

}
