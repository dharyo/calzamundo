package com.calzamundoshoes.calzamundo.service;

import java.util.List;

import com.calzamundoshoes.calzamundo.Repository.ICalzadoRepository;
import com.calzamundoshoes.calzamundo.entity.Calzado;


public class CalzadoService implements ICalzadoService{
    
    private ICalzadoRepository calzadoRepository;

    public CalzadoService(ICalzadoRepository calzadoRepository){
        this.calzadoRepository = calzadoRepository;
    }

    @Override
    public List<Calzado> getAllCalzados(){
        return calzadoRepository.findAllSortByName();
    }

    @Override
    public List<Calzado> getCalzadoByNombreCalzados(String name){
        return calzadoRepository.findByNameContaining(name);
    }

    @Override
    public List<Calzado> getCalzadoByValorCalzados(String totalVenta) {
        return calzadoRepository.findByValorCalzado(totalVenta);
    }

    @Override
    public Calzado saveCalzado(Calzado calzado) {
        return calzadoRepository.save(calzado);
    }

    @Override
    public Calzado getCalzadoByIdCalzado(Long id) {
        return calzadoRepository.getReferenceById(id);

    }

    @Override
    public void deleteCalzadoById(Long id) {
        calzadoRepository.deleteById(id);
    }

    @Override
    public Calzado updateCalzado(Calzado calzado) {
        return calzadoRepository.save(calzado);
    }
    

}
