package com.calzamundoshoes.calzamundo.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSale;

    @Column(name = "total_sale", nullable = false)
    private String totalSale;
    @Column(name = "date_sale")
    private String dateSale;

    /*
     * @OneToMany( targetEntity = Calzado.class)
     * private List<Calzado> calzadoList;
     */
    @ManyToOne
    private Product product;
    @OneToOne
    private User user;

    @OneToOne
    private Customer customer;
}
