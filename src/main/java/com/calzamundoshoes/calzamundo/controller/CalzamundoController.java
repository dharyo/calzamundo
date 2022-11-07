package com.calzamundoshoes.calzamundo.controller;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.calzamundoshoes.calzamundo.entity.*;
import com.calzamundoshoes.calzamundo.service.*;

import antlr.collections.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class CalzamundoController {

    @Autowired
    private SaleService saleService;
    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private UserService userService;

    public CalzamundoController(ProductService productService) {
        this.productService = productService;

    }

    /*
     * public CalzamundoController(ProductService productService, UserService
     * userService) {
     * this.productService = productService;
     * this.userService = userService;
     * 
     * }
     */

    public CalzamundoController() {

    }

    /*
     * @GetMapping("/logout")
     * 
     * }@GetMapping("/validateUser"){
     * 
     * }
     */

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("product", productService.getAllProducts());
        return "products";
    }

    @GetMapping("/inventory")
    public String listProductsInventory(Model model) {
        model.addAttribute("product", productService.getAllProducts());
        return "inventory";
    }

    @GetMapping("/sales")
    public String listProductsSales(Model model) {
        model.addAttribute("product", productService.getAllProducts());
        return "sales";
    }

    @GetMapping("/sales/{id}")
    public String calculateSale(@PathVariable Long id, @ModelAttribute("product") Product product, Model model) {
        Product existentProduct = productService.getProductByIdProduct(id);

        int price = Integer.parseInt(existentProduct.getPriceProduct()) * 5;
        System.out.println(price);

        return "redirect:/sales";
    }

    @GetMapping("/create")
    public String createProductsForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "create_shoes";
    }

    @PostMapping("/products")
    public String saveProducts(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "products";
    }

    @GetMapping("/update/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        System.out.println("entro a update");

        Product product = productService.getProductByIdProduct(id);
        model.addAttribute("product", product);
        return "update_shoes";
    }

    @PostMapping("/products/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") Product product, Model model) {
        Product existentProduct = productService.getProductByIdProduct(id);

        existentProduct.setIdProduct(id);
        existentProduct.setNameProduct(product.getNameProduct());
        existentProduct.setDescripcionProduct(product.getDescripcionProduct());
        existentProduct.setTypeProduct(product.getTypeProduct());
        existentProduct.setSizeProduct(product.getSizeProduct());
        existentProduct.setPriceProduct(product.getPriceProduct());

        productService.updateProduct(existentProduct);
        return "redirect:/products";
    }

    @GetMapping("/products/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return "redirect:/products";
    }

    @RequestMapping("/login")
    public String iniciarSesion() {
        return "login";
    }
}
