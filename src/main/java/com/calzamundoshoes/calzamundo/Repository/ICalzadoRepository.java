package com.calzamundoshoes.calzamundo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.calzamundoshoes.calzamundo.entity.Calzado;

public interface ICalzadoRepository extends JpaRepository<Calzado, Long>{

    @Query("FROM Calzado c WHERE c.nombreCalzado LIKE :name")
    public List<Calzado> findByNameContaining(@Param("name") String name);

    @Query(value ="FROM Calzado c WHERE c.valorCalzado <=totalVenta", nativeQuery = true)
    List<Calzado> findByValorCalzado(@Param("totalVenta") String totalVenta);

    @Query(value= "FROM Calzado c ORDER BY nombreCalzado ASC", nativeQuery = true)
    public List<Calzado> findAllSortByName();
}
