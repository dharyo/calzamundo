package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.Usuarios;



public interface IUsuariosService {
    
    List<Usuarios> getAllusuarios();

    Usuarios saveUsuarios(Usuarios usuarios);

    Usuarios getUsuariosById(Long id);

    Usuarios updateUsuarios(Usuarios usuarios);

    void deleteUsuariosById(Long id);


}
