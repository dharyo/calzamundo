package com.calzamundoshoes.calzamundo.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;

    @Column(name = "name_cus")
    private String nameCustomer;

    @Column(name = "last_name_cus")
    private String lastNameCustomer;

    @Column(name = "identification_type_cus")
    private String typeIdentificationCustomer;

    @Column(name = "identification_number_cus")
    private String numIdentificationCustomer;

    @Column(name = "email_cus")
    private String emailCustomer;

}
