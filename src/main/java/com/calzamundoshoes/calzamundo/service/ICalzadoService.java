package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.entity.Calzado;;

public interface ICalzadoService {
    List<Calzado> getAllCalzados();
    
    List<Calzado> getCalzadoByNombreCalzados(String name);
    
    List<Calzado> getCalzadoByValorCalzados(String totalVenta);

    Calzado saveCalzado(Calzado calzado);

    Calzado getCalzadoByIdCalzado(Long id);

    Calzado updateCalzado(Calzado calzado);

    void deleteCalzadoById(Long id);

}
