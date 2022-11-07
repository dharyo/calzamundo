package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.Product;;

public interface IProductService {
    List<Product> getAllProducts();

    // List<Product> getProductByNameProducts(String name);

    // List<Product> getProductByPriceProducts(String totalVenta);

    Product saveProduct(Product product);

    Product getProductByIdProduct(Long id);

    Product updateProduct(Product product);

    void deleteProductById(Long id);

}
