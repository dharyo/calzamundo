package com.calzamundoshoes.calzamundo.entity;

import javax.persistence.*;

import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "name_prod", nullable = false)
    private String nameProduct;

    @Column(name = "type_product")
    private String typeProduct;

    @Column(name = "price_prod")
    private String priceProduct;

    @Column(name = "description_prod")
    private String descripcionProduct;

    @Column(name = "size_prod")
    private int sizeProduct;

    @Column(name = "amount_prod")
    private int amountProduct;

    /*
     * @OneToMany()
     * 
     * @JoinColumn(name = "idVenta")
     * private Ventas ventas;
     */
    @OneToMany(mappedBy = "product")
    private List<Sale> salesList;
}
