package com.calzamundoshoes.calzamundo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.calzamundoshoes.calzamundo.entity.Calzado;

public interface ICalzadoRepository extends JpaRepository<Calzado, Long>{

    @Query("FROM calzado c WHERE c.nombreCalzado LIKE :name")
    public List<Calzado> findByNameContaining(@Param("name") String name);

    @Query("FROM calzado c WHERE c.valorCalzado <=totalVenta")
    List<Calzado> findByValorCalzado(@Param("totalVenta") String totalVenta);

    @Query("FROM calzado c ORDER BY nombreCalzado ASC")
    public List<Calzado> findAllSortByName();
}
