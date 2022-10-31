package com.calzamundoshoes.calzamundo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.calzamundoshoes.calzamundo.entity.Cliente;


public interface IClienteRepository extends JpaRepository<Cliente, Long>{
    @Query("FROM cliente c WHERE c.nombreCliente LIKE :name")
    public List<Cliente> findByNameContaining(@Param("name") String name);

    @Query("FROM cliente c WHERE c.apellidoCliente LIKE :name")
    public List<Cliente> findBySurnameContaining(@Param("name") String name);

    @Query("FROM cliente c WHERE c.numIdentificacion LIKE :name")
    public List<Cliente> findByNumIdentificacionContaining(@Param("name") String name);
    
}
