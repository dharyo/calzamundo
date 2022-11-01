package com.calzamundoshoes.calzamundo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calzamundoshoes.calzamundo.service.VentasService;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class CalzamundoController {

    @Autowired
    private VentasService ventasService;
    

    //private List<>

    public CalzamundoController(VentasService ventasService){
        this.ventasService = ventasService;
    }


   

    @RequestMapping ("/")
    public String index() {
        return "index";
    }

    @RequestMapping ("/index")
    public String index2() {
        return "index";
    }

    @RequestMapping ("/home")
    public String home() {
        return "home";
    }
    
    @RequestMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @GetMapping("/products")
    public String productos() {
        return "products";
    }

    @GetMapping("/create")
    public String crear() {
        return "create_shoes";
    }

    @GetMapping("/update")
    public String actualizar() {
        return "update_shoes";
    }

    @GetMapping("/sales")
    public String ventas() {
        return "sales";
    }
     @GetMapping("/inventory")
    public String inventario() {
        return "inventory";
    }

    @GetMapping("/contact")
    public String contacto() {
        return "contact";
    }
}


 