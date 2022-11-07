package com.calzamundoshoes.calzamundo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.calzamundoshoes.calzamundo.entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    @Query("FROM Customer c WHERE c.nameCustomer LIKE :name")
    public List<Customer> findByNameContaining(@Param("name") String name);

    @Query("FROM Customer c WHERE c.lastNameCustomer LIKE :name")
    public List<Customer> findBySurnameContaining(@Param("name") String name);

    @Query("FROM Customer c WHERE c.numIdentificationCustomer LIKE :name")
    public List<Customer> findByNumIdentificacionContaining(@Param("name") String name);

}
