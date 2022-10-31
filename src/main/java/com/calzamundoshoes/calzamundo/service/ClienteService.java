package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.Repository.IClienteRepository;
import com.calzamundoshoes.calzamundo.entity.Cliente;

public class ClienteService implements IClienteService{
    
    private IClienteRepository clienteRepository;

    public ClienteService(IClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> getClientesByNombreClientes(String name){
        return clienteRepository.findByNameContaining(name);
    }
    
    @Override
    public List<Cliente> getClientesByApellidoClientes(String surname){
        return clienteRepository.findBySurnameContaining(surname);
    }
    
    @Override
    public List<Cliente> getClientesByIdentificacion(String id){
        return clienteRepository.findByNumIdentificacionContaining(id);
    }

    @Override
    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente getClienteByIdCliente(Long id){
        return clienteRepository.findById(id).get();
    }

    @Override
    public Cliente updateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteClienteById(Long id){
        clienteRepository.deleteById(id);
    }

}
