package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.Cliente;

public interface IClienteService {
    List<Cliente> getAllClientes();
    
    List<Cliente> getClientesByNombreClientes(String name);
    
    List<Cliente> getClientesByApellidoClientes(String surname);

    List<Cliente> getClientesByIdentificacion(String id);

    Cliente saveCliente(Cliente cliente);

    Cliente getClienteByIdCliente(Long id);

    Cliente updateCliente(Cliente cliente);

    void deleteClienteById(Long id);

}

