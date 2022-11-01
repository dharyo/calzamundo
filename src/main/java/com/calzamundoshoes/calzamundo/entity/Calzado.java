package com.calzamundoshoes.calzamundo.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "calzado")
public class Calzado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCalzado;

    @Column(name = "nombre", nullable = false)
    private String nombreCalzado;

    @Column(name = "tipoCalzado")
    private String tipoCalzado;

    @Column(name = "valor")
    private String valorCalzado;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne()
    @JoinColumn(name = "idVentas")
    private Ventas ventas; 
}
