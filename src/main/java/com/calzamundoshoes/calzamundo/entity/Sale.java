package com.calzamundoshoes.calzamundo.entity;

import java.util.Date;

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
    private Long totalSale;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_sale")
    private Date dateSale;

    @Column(name = "amount_sale")
    private int amountSale;

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
