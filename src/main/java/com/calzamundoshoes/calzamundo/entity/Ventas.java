package com.calzamundoshoes.calzamundo.entity;

import java.util.ArrayList;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "calzado")
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    @Column(name = "total_Venta", nullable = false)
    private String totalVenta;

    @Column(name = "fecha_venta")
    private String fechaVenta;



@OneToMany( targetEntity = Calzado.class)
private ArrayList<Calzado> calzadoList;


    
}
