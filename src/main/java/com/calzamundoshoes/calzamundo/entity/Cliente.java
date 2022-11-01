package com.calzamundoshoes.calzamundo.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "apellido_cliente")
    private String apellidoCliente;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @Column(name = "num_identificacion")
    private String numIdentificacion;

    @Column(name = "correo_cliente")
    private String correoCliente;

}
