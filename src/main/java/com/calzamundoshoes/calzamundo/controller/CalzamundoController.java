package com.calzamundoshoes.calzamundo.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.calzamundoshoes.calzamundo.service.CalzadoService;

public class CalzamundoController {

    //@Autowired
    //private CalzadoService calzadoService;
   

    @RequestMapping("/")
    public String principal() {
        return "index";
    }

    @RequestMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @RequestMapping("/products")
    public String productos() {
        return "products";
    }

    @RequestMapping("/create")
    public String crear() {
        return "create_shoes";
    }

    @RequestMapping("/update")
    public String actualizar() {
        return "update_shoes";
    }

    @RequestMapping("/sales")
    public String ventas() {
        return "sales";
    }
}
