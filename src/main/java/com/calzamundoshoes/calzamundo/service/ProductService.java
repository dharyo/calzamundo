package com.calzamundoshoes.calzamundo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.calzamundoshoes.calzamundo.Repository.IProductRepository;
import com.calzamundoshoes.calzamundo.entity.Product;

import net.bytebuddy.asm.Advice.Return;

@Service
public class ProductService implements IProductService {

    private IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    /*
     * @Override
     * public List<Product> getProductByNameProducts(String name) {
     * return productRepository.findByNameContaining(name);
     * }
     */

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductByIdProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

}
