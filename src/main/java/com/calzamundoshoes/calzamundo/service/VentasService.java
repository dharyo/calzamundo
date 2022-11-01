package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.calzamundoshoes.calzamundo.Repository.IVentasRepository;
import com.calzamundoshoes.calzamundo.entity.Ventas;

@Service
public class VentasService implements IVentasService {
    
    private IVentasRepository ventasRepository;

    public VentasService(IVentasRepository ventasRepository) {
        this.ventasRepository = ventasRepository;
    }

    @Override
    public List<Ventas> getAllVentas(){
        return ventasRepository.findAll();
    }

    @Override
    public List<Ventas> getVentasByDate(String date){
        return ventasRepository.findByDateContaining(date);
    }

    @Override
    public Ventas saveVentas(Ventas ventas){
        return ventasRepository.save(ventas);
    }

    @Override
    public Ventas getVentasById(Long id){
        return ventasRepository.findById(id).get();
    }

    @Override
    public Ventas updateVentas(Ventas ventas){
        return ventasRepository.save(ventas);
    }

    @Override
    public void deleteVentasById(Long id){
        ventasRepository.deleteById(id);
    }
}
