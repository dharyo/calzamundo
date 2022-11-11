package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.calzamundoshoes.calzamundo.Repository.ISaleRepository;
import com.calzamundoshoes.calzamundo.entity.Sale;

@Service
public class SaleService implements ISaleService {

    private ISaleRepository salesRepository;

    public SaleService(ISaleRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @Override
    public List<Sale> getAllSales() {
        return salesRepository.findAll();
    }

    /*
     * @Override
     * public List<Sale> getSaleByDate(String date) {
     * return salesRepository.findByDateContaining(date);
     * }
     */

    @Override
    public Sale saveSale(Sale Sale) {
        return salesRepository.save(Sale);
    }

    @Override
    public Sale getSaleById(Long id) {
        return salesRepository.findById(id).get();
    }

    @Override
    public Sale updateSale(Sale Sale) {
        return salesRepository.save(Sale);
    }

    @Override
    public void deleteSaleById(Long id) {
        salesRepository.deleteById(id);
    }
}
