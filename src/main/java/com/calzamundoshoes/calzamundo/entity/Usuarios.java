package com.calzamundoshoes.calzamundo.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "rol_usuario")
    private String rolUsuario;

    @Column(name = "nombreEmpleado")
    private String nombreEmpleado;


}
