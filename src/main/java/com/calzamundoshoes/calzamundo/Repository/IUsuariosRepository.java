package com.calzamundoshoes.calzamundo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.calzamundoshoes.calzamundo.entity.Usuarios;


public interface IUsuariosRepository extends JpaRepository<Usuarios, Long>{
    
    @Query("FROM usuarios u WHERE u.nombreUsuario LIKE :name")
    public List<Usuarios> findByNameContaining(@Param("name") String name);
}
