package com.calzamundoshoes.calzamundo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calzamundoshoes.calzamundo.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    @Modifying
    @Transactional
    @Query("FROM Product")
    public List<Product> findAllSortByName();

    /*
     * @Query(value = "FROM Calzado c WHERE c.valorCalzado <=totalVenta",
     * nativeQuery = true)
     * List<Product> findByValorCalzado(@Param("totalVenta") String totalVenta);
     * 
     * @Query(value = "FROM Calzado c ORDER BY nombreCalzado ASC", nativeQuery =
     * true)
     * public List<Product> findAllSortByName();
     */
}
