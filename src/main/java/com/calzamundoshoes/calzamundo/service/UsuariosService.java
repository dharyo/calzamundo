package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.Repository.IUsuariosRepository;
import com.calzamundoshoes.calzamundo.entity.Usuarios;

public class UsuariosService implements IUsuariosService{

    private IUsuariosRepository usuariosRepository;

    public UsuariosService(IUsuariosRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    public List<Usuarios> getAllusuarios(){
        return usuariosRepository.findAll();
    }

    @Override
    public Usuarios saveUsuarios(Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }

    @Override
    public Usuarios getUsuariosById(Long id){
        return usuariosRepository.findById(id).get();
    }

    @Override
    public Usuarios updateUsuarios(Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }

    @Override
    public void deleteUsuariosById(Long id){
        usuariosRepository.deleteById(id);
    }

}
