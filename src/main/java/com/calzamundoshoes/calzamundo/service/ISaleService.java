package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.Sale;

public interface ISaleService {

    List<Sale> getAllSales();

    Sale saveSale(Sale sale);

    Sale getSaleById(Long id);

    Sale updateSale(Sale sale);

    void deleteSaleById(Long id);
}
