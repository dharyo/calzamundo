package com.calzamundoshoes.calzamundo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.calzamundoshoes.calzamundo.entity.Sale;

import java.util.List;

@Repository
public interface ISaleRepository extends JpaRepository<Sale, Long> {

    @Query("FROM Sale v Where v.dateSale like :date")
    List<Sale> findByDateContaining(@Param("date") String date);

    /*
     * @Query("FROM Sales v WHERE v.totalVenta <=totalVenta")
     * List<Sale> findByTotalVenta(@Param("totalVenta") String totalVenta);
     * 
     * @Query("FROM Sales v ORDER BY date")
     * public List<Sale> findAllSortByFechaVenta();
     */

}
