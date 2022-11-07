package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.calzamundoshoes.calzamundo.Repository.ICustomerRepository;
import com.calzamundoshoes.calzamundo.entity.Customer;

@Service
public class CustomerService implements ICustomerService {

    private ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getCustomersByNombreCustomer(String name) {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getCustomersByLastNameCustomers(String surname) {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getCustomersByIdentificacion(String id) {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByIdCustomer(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);

    }

}
