package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.Ventas;

public interface IVentasService {
    
    List<Ventas> getAllVentas();

    List<Ventas> getVentasByDate(String date);

    Ventas saveVentas(Ventas ventas);

    Ventas getVentasById(Long id);

    Ventas updateVentas(Ventas ventas);

    void deleteVentasById(Long id);
}
