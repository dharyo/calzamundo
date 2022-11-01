package com.calzamundoshoes.calzamundo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.calzamundoshoes.calzamundo.entity.Ventas;

import java.util.List;

public interface IVentasRepository extends JpaRepository<Ventas, Long>{
    
    @Query("FROM Ventas v Where v.fechaVenta like :date")
    List<Ventas> findByDateContaining(@Param("date") String date);

    @Query("FROM Ventas v WHERE v.totalVenta <=totalVenta")
    List<Ventas> findByTotalVenta(@Param("totalVenta") String totalVenta);

    @Query("FROM Ventas v ORDER BY fechaVenta")
    public List<Ventas> findAllSortByFechaVenta();
    
}
